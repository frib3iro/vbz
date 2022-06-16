package cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer10 {

    public static void main(String[] args) {

        // Faça um Programa que peça a temperatura em graus Celsius,
        // transforme e mostre em graus Farenheit.
        // Scanner scan = new Scanner(System.in);
        Scanner scan = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        
        System.out.print("Digite a temperatura em Celsius: ");
        double c = scan.nextDouble();

        // °F = °C × 1,8 + 32
        double f = (c * 1.8) + 32;

        System.out.println("A temperatura " + c + "° equivale a " + f + "°");
        scan.close();
    }

}
