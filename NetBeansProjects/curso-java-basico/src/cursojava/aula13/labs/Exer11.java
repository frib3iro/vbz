package cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer11 {

    public static void main(String[] args) {

        // Faça um Programa que peça 2 números inteiros e um número real.
        // Calcule e mostre:
        // a. o produto do dobro do primeiro com metade do segundo .
        // b. a soma do triplo do primeiro com o terceiro.
        // c. o terceiro elevado ao cubo.
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        
        System.out.print("digite o primeiro numero inteiro: ");
        int num1 = scan.nextInt();

        System.out.print("digite o segundo numero inteiro: ");
        int num2 = scan.nextInt();

        System.out.print("digite um numero real: ");
        double num3 = scan.nextDouble();

        int resultado1 = (num1 * 2) * (num2 / 2);
        double resultado2 = (num1 * 3) + num3;
        double resultado3 = Math.pow(num3, 3);

        System.out.println("Resultado 1: " + resultado1);
        System.out.println("Resultado 2: " + resultado2);
        System.out.println("Resultado 3: " + resultado3);
        scan.close();
    }
}
