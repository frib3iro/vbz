package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer05 {
    
    public static void main(String[] args) {        
        
        // Faça um Programa que converta metros para centímetros.
        
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a quantidade de metros: ");
        int metros = scan.nextInt();
        
        int cm = metros * 100;
        
        System.out.println( metros + " m" + " convertidos para centimetros é: " + cm + " cm");
        
        scan.close();
    }
}
