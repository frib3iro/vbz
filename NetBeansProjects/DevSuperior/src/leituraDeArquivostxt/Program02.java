package leituraDeArquivostxt;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program02 {

    public static void main(String[] args) {

        String path = "C:\\Users\\Fabio\\Desktop\\mega.txt";

        FileReader fr = null;
        BufferedReader br = null;

        try {
            fr = new FileReader(path);
            br = new BufferedReader(fr);
            String line = br.readLine();
            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } 
        catch (IOException e) {
            System.out.println("Erro: " + e.getMessage());
        } 
        finally {
            try {
                br.close();
                fr.close();
            } 
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
