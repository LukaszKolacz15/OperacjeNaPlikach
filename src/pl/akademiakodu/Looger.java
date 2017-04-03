package pl.akademiakodu;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;

public class Looger {
    // Wywołanie
    public static void main(String[] args) {
        // Wyobrażamy sobie sytuację, w której musimy użyć loggera

        File f = new File("F:\\Java\\IdeaProjects\\logger.txt");

        Looger logger = new Looger(f, "AkademiaKodu");
        logger.log("Witaj świecie, jestem pierwszym logiem");
        System.out.println("DODANO DO LOGGERA");
    }
    ////////////

//    FORMATER DAT:
//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");        String i = formatter.format(LocalDateTime.now());




    private File file;
    private String prefix;


    public Looger(File f, String prefix){
        this.file = f;
        this.prefix = prefix;
    }

    public void log(String message){
        String allPrefix = LocalDate.now().toString() + " <" + prefix + ">: " + message + "\r\n";
        try {
            Files.write(file.toPath(), allPrefix.getBytes(), StandardOpenOption.APPEND);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}