package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer06 {

    public static void main(String[] args) {

        // Faça um Programa que peça o raio de um círculo, calcule e mostre sua área.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");

        double raio = scan.nextDouble();

        double area = Math.PI * Math.pow(raio, 2);

        System.out.println("A area do circulo é: " + area);
        scan.close();
    }
}
