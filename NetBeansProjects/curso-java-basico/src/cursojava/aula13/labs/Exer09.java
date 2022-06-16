package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer09 {

    public static void main(String[] args) {

        // Faça um Programa que peça a temperatura em graus Farenheit,
        // transforme e mostre a temperatura em graus Celsius.
        // C = (5 * (F-32) / 9).
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Digite a temperatura em Farenheit: ");
        double f = scan.nextDouble();
        
        double c = (5 *(f - 32) / 9);
        
        System.out.println("A temperatura " + f + " equivale a " + c);
        scan.close();
    }

}
