package cursojava.testes;

import java.awt.HeadlessException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class LeituraDeArquivos {
 
    public static void main(String[] args) {

        Path caminho = Paths.get("C:/Users/Fabio/Desktop/mega.txt");

        try {

            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);
            System.out.println(leitura);
        } catch (HeadlessException | IOException erro) {
        }

    }
}
