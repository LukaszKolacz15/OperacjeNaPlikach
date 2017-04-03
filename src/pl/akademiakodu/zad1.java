package pl.akademiakodu;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Lukasz Kolacz on 27.03.2017.
 */
public class zad1 {

    public static void main(String[] args) {

//        File myCatalog = new File("D:\\Ak\\");
//        File myFile = new File("D:\\Ak\\", "akademia.kodu");
//
//        myCatalog.mkdirs();
//        try {
//            myFile.createNewFile();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        if(myFile.exists()){
//            System.out.println("plik istnieje");
//        }

//        ----------------------------------------------------------------------------------

//        Zadanie 1
//        "Utwórz ręcznie na dysku pliki test.txt, akademia.kodu, pasta.mojeRoz następnie w
//        programie sprawdź czy pliki istnieją."

//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//        E:\Java\IdeaProjects\test.txt\

//        File myFile = new File("E:\\Java\\IdeaProjects\\akademia.kodu");
//        if(myFile.exists()){
//            System.out.println("ISTNIEJE ");
//        }else {
//            System.out.println("Plik o podanej ścieżce nie istnieje");
//        }

//        --------------------------------------------------------------------
//        Zadanie 2
//        "W programie stwórz plik test.txt, jeżeli istnieje
//        nie nadpisuj, następnie zapisuj do niego to, co
//        użytkownik wpisze do konsoli."

//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

//        File myFile = new File("E:\\Java\\IdeaProjects\\test.txt");
//        Scanner scanner = new Scanner(System.in);
//        if(!myFile.exists()) {
//            try{
//                myFile.createNewFile();
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }
//        for (int i=0; i<5; i++){
//            System.out.println("Podaj tekst");
//            try{
//                Files.write(myFile.toPath(), (scanner.nextLine() + "\r\n").getBytes(), StandardOpenOption.APPEND);
//            }catch (IOException e){
//                e.printStackTrace();
//            }
//        }

//        -------------------------------------------------------------------------
//        Zadanie 3
//        "Stwórz program, który wyświetli wszystkie linie
//        zapisane w pliku test.txt z zadania 2."

//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^


//        try{
////            ArrayList<String> linesOfText = (ArrayList<String>) Files.readAllLines(Paths.get("E:\\Java\\IdeaProjects\\test.txt"));
////
//                                                      LUB
////                                          (obie metody działają)

//            List<String> linesOfText = Files.readAllLines(Paths.get("E:\\Java\\IdeaProjects\\test.txt"));
//
//            for(String line : linesOfText){
//                System.out.println(line);
//            }
//        }catch (IOException e){
//            e.printStackTrace();
//        }

//        -------------------------------------------------------------------------

//        Zadanie 4
//        "Stwórz aplikację, która pozwoli użytkownikowi
//        na tworzenie plików i katalogów przez niego
//        wybranych."

//        ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^

        Scanner scanner = new Scanner(System.in);

        // 1 - katalog
        // 2 - plik
        // 3 - exit
        System.out.println("1 - aby utworzyć katalog");
        System.out.println("2 - aby utworzyć plik");
        System.out.println("3 - aby wyjść");
        int option = 0;
        do {
            System.out.print("Wybierz opcje: ");
            option = scanner.nextInt();
            scanner = new Scanner(System.in);
            switch (option){
                case 1: {
                    System.out.print("Podaj adres do katalogu: ");
                    String catalog = scanner.nextLine();
                    File file = new File(catalog);
                    if(file.mkdirs()) {
                        System.out.println("Udało się utworzyć katalog");
                    }else {
                        System.out.println("Wystąpił błąd lub katalog już istnieje");
                    }
                    break;
                }
                case 2: {
                    System.out.print("Podaj sciężkę do pliku: ");
                    String catalog = scanner.nextLine();
                    File file = new File(catalog);
                    try{
                        if(file.createNewFile()) {
                            System.out.println("Udało się utworzyć plik");
                        }else {
                            System.out.println("Wystąpił błąd lub plik już istnieje");
                        }
                    }catch(IOException io){
                        io.printStackTrace();
                    }
                    break;
                }
            }
        }while(option != 3);

    }
}

