package pl.akademiakodu;

import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Zad5 {
    public static void main(String[] args) {
        List<String> linesInFile = Collections.emptyList();
        List<String> linesInFileNew = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        try {
            linesInFile  =  Files.readAllLines(Paths.get("F:\\Java\\IdeaProjects\\zdania.txt"));
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Plik został otwarty");
        System.out.print("Podaj dane do zamienienia: ");
        String data = scanner.nextLine();
        String[] dataArray = data.split(" ");

        for(String line : linesInFile) {
            linesInFileNew.add(line.replaceAll(dataArray[0], dataArray[1]));
        }

        try {
            Files.write(Paths.get("F:\\Java\\IdeaProjects\\zdania.txt"), linesInFileNew, Charset.forName("UTF-8"), StandardOpenOption.CREATE);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
