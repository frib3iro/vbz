package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer07 {
    
    public static void main(String[] args) {        
        
        // Faça um Programa que calcule a área de um quadrado, em seguida mostre o dobro desta área para o usuário.
        // A = b.h
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite o tamanho do lado do quadrado: ");
        double lado = scan.nextDouble();
        
        double area = Math.pow(lado, 2);
        
        System.out.println("A área do quadrado é: " + area);
        System.out.println("O dobro  da área do quadrado é: " + (area * 2));
        
        scan.close();
    }
}
