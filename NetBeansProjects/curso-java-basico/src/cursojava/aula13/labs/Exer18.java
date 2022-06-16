package cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer18 {

    public static void main(String[] args) {
        // Faça um programa que peça o tamanho de um arquivo para download
        // (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
        // informe o tempo aproximado de download do arquivo usando este link
        // (em minutos).
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        System.out.print("Entre com tamanho do arquivo: ");
        double tmArquivo = scan.nextDouble();
        
        System.out.print("enre com a velocidade da internet: ");
        double vlInternet = scan.nextDouble();
        
        double tempo = tmArquivo / vlInternet;
        
        System.out.println("Tempo de download: " + tempo);
        
        
        scan.close();
    }

}
