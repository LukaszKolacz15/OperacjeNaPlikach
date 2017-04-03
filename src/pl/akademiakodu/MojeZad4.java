package pl.akademiakodu;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * Created by Lukasz Kolacz on 28.03.2017.
 */
public class MojeZad4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("WYBIERZ OPERACJĘ");
        System.out.println("1. Stwórz folder ");
        System.out.println("2. Stwórz plik ");
        System.out.println("3. Wprowadź i zapisz tekst");
        System.out.println("4. Odczytaj tekst z pliku");
        System.out.println("5. Exit ");


        int numb;
        String filePath = " ";

        do {
            numb = scanner.nextInt();

            switch (numb) {
                case 1:
                    System.out.println("Podaj ścieżkę do folderu: ");
                    System.out.println("<!>  PAMIĘTAJ O ZASTOSOWANIU PODWÓJNEGO BACKSLASH-a  <!>");
//                  String path =  "E:\\Test\\Zadanie4";
                    String path = scanner.next();
                    File folder = new File(path);

                    if (folder.exists()) {
                        System.out.println("Folder o podanej ścieżce już istnieje! ");
                    }
                    if (folder.mkdirs()) {
                        System.out.println("Folder został utworzony! Scieżka dostępu: " + path);
                    } else {
                        System.out.println("Wystąpił błąd podczas tworzenia filderu");
                    }

                    break;


                case 2:

                    System.out.println("Podaj ścieżkę do pliku: ");

//                  String filePath = "E:\\Test\\Zadanie4\\test.txt";

                    filePath = scanner.next();
                    File file = new File(filePath);
                    try {
                        if (file.exists()) {
                            System.out.println("Plik o podanej ścieżce już istnieje! ");
                        }
                        if (file.createNewFile()) {
                            System.out.println("Plik został utworzony! Scieżka do pliku: " + filePath);
                        }else {
                            System.out.println("Wystąpił prodczas tworzenia pliku");
                        }
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                    break;


                case 3:

                    System.out.println("Wpisz tekst jaki chcesz zapisać: ");
                    String text = scanner.next();
                    try {
                        FileOutputStream fout = new FileOutputStream(filePath,true);
                        try {
                            fout.write(text.getBytes(Charset.forName("UTF-8")));
                            fout.close();
                        } catch (IOException e) {
                            e.printStackTrace();
                            System.out.println("<!>  Coś poczło nie tak podczas zapisywania :/  <!>");
                        }
                    } catch (FileNotFoundException e) {
                        e.printStackTrace();
                    }
                    break;

                case 4:
                    System.out.println("Podaj ścieżkę:");
                    filePath = scanner.next();
                    try {
                        System.out.println(Files.readAllLines(Paths.get(filePath)));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }


//                    try {
//                        FileInputStream fin = new FileInputStream(filePath);
//                        try {
//                            int readedText = fin.read();
//                            System.out.println(readedText);
//                            fin.close();
//                        } catch (IOException e) {
//                            e.printStackTrace();
//                        }
//                    } catch (FileNotFoundException e) {
//                        e.printStackTrace();
//                    }
                    break;
            }
        } while (numb != 5);
    }

}
