package leituraDeArquivostxt;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Program01 {

    public static void main(String[] args) {

        File file = new File("C:\\Users\\Fabio\\Desktop\\mega.txt");
        Scanner s = null;

        try {
            s = new Scanner(file);
            while (s.hasNextLine()) {
                System.out.println(s.nextLine());
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            if (s != null) {
                s.close();
            }
        }
    }
}
