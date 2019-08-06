package com.infoshare.jse.files.exercise.zad5domowe;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

import static java.nio.file.StandardCopyOption.*;

public class domowe5 {

    public static void main( String[] args ) throws IOException {
        Files.move(Paths.get("./src/main/java/com/infoshare/jse/files/exercise/zad4/myFile1"),
                Paths.get("./src/main/java/com/infoshare/jse/files/exercise/mojpulpit/myFile1"),
                StandardCopyOption.REPLACE_EXISTING);
        Files.copy(Paths.get("./src/main/java/com/infoshare/jse/files/exercise/mojpulpit/myFile1"),
                Paths.get("./src/main/java/com/infoshare/jse/files/exercise/mojpulpit/myFile1copy"),
                StandardCopyOption.REPLACE_EXISTING);
        Scanner sc = new Scanner("./src/main/java/com/infoshare/jse/files/exercise/mojpulpit/myFile1copy");
        String input = sc.nextLine();
        char[] chars = input.toCharArray();
        File file = new File("./src/main/java/com/infoshare/jse/files/exercise/mojpulpit/myFile1copy");





        PrintWriter pw = new PrintWriter(file);
        for(int i = chars.length - 1; i >= 0 ; i--){
            pw.print(chars[i]);
        }
        pw.close();










    }
}
