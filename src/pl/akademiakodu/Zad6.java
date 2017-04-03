package pl.akademiakodu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.util.Scanner;

/**
 * Created by Lukasz Kolacz on 28.03.2017.
 */
public class Zad6 {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        File logDzialania = new File("E:\\Java\\IdeaProjects\\dzialania.txt");

        if(!logDzialania.exists()) {
            try{
                logDzialania.createNewFile();
            }catch (IOException e){
                e.printStackTrace();
            }
        }

        do {
            System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");
            System.out.println("<><><>       C A L C U L A T O R      <><><>");
            System.out.println("<><>                                    <><>");
            System.out.println("<>                                        <>");
            System.out.println("--------------------------------------------");
            System.out.println("<>            Podaj dwie liczby           <>");
            System.out.print("               Pierwsza liczba: ");

            int firstNumber = scanner.nextInt();

            System.out.print("                 Druga liczba: ");

            int secondNumber = scanner.nextInt();

//        System.out.println(firstNumber + " " + secondNumber);
            System.out.println("<>                                        <>");
            System.out.println("<>        Wybierz numer działania         <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [1] *  (Mnożenie)            <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [2] /  (Dzielenie)           <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [3] +  (Dodawanie)           <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [4] -  (Odejmowanie)         <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [5] %  (Reszta z dzielenia)  <>");
            System.out.println("<>                                        <>");
            System.out.println("<>           [6]    (Exit)                <>");
            System.out.println("<>                                        <>");

            int sign = scanner.nextInt();

//        System.out.println(sign);

            switch (sign) {
                case 1:
                    System.out.println("<>                WYNIK TO:               <>");
                    System.out.println("<>                                        <>");
                    System.out.println("<>                    " + (firstNumber * secondNumber) + "                  <>");
                    System.out.println("<><>                                    <><>");
                    System.out.println("<><><>                                <><><>");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                    try {
                        Files.write(logDzialania.toPath(), (firstNumber + " * " + secondNumber + " = " + (firstNumber * secondNumber ) + "\r\n").getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;

                case 2:
                    if (firstNumber == 0 || secondNumber == 0) {
                        System.out.println("<!>   NIE DZIEL PRZEZ ZERO CHOLERO!  <!>");
                    } else {
                        System.out.println("<>                Wynik to:               <>");
                        System.out.println("<>                                        <>");
                        System.out.println("<>                    " + (firstNumber / secondNumber) + "              <>");
                        System.out.println("<><>                                    <><>");
                        System.out.println("<><><>                                <><><>");
                        System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                        try {
                            Files.write(logDzialania.toPath(), (firstNumber + " / " + secondNumber + " = " + (firstNumber / secondNumber ) + "\r\n").getBytes(), StandardOpenOption.APPEND);
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                    break;

                case 3:
                    System.out.println("<>                Wynik to:               <>");
                    System.out.println("<>                                        <>");
                    System.out.println("<>                    " + (firstNumber + secondNumber) + "                  <>");
                    System.out.println("<><>                                    <><>");
                    System.out.println("<><><>                                <><><>");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                    try {
                        Files.write(logDzialania.toPath(), (firstNumber + " + " + secondNumber + " = " + (firstNumber + secondNumber ) + "\r\n").getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;

                case 4:
                    System.out.println("<>                Wynik to:               <>");
                    System.out.println("<>                                        <>");
                    System.out.println("<>                    " + (firstNumber - secondNumber) + "                  <>");
                    System.out.println("<><>                                    <><>");
                    System.out.println("<><><>                                <><><>");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                    try {
                        Files.write(logDzialania.toPath(), (firstNumber + " - " + secondNumber + " = " + (firstNumber - secondNumber ) + "\r\n").getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;

                case 5:
                    System.out.println("<>                Wynik to:               <>");
                    System.out.println("<>                                        <>");
                    System.out.println("<>                    " + (firstNumber % secondNumber) + "                  <>");
                    System.out.println("<><>                                    <><>");
                    System.out.println("<><><>                                <><><>");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><><><>");

                    try {
                        Files.write(logDzialania.toPath(), (firstNumber + " % " + secondNumber + " = " + (firstNumber % secondNumber ) + "\r\n").getBytes(), StandardOpenOption.APPEND);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("<!>   WYBIERZ PRAWIDŁOWY NUMER DZIAŁANIA  <!>");
                    System.out.println("<><>                                     <><>");
                    System.out.println("<><><>                                 <><><>");
                    System.out.println("<><><><><><><><><><><><><><><><><><><><><><><>");
            }
        } while (true);
    }
}
