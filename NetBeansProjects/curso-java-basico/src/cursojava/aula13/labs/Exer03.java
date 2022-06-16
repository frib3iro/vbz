package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer03 {

    public static void main(String[] args) {

        // Faça um Programa que peça dois números e imprima a soma.
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite o primeiro numero inteiro: ");

        int num1 = scan.nextInt();

        System.out.print("Digite o segundo numero inteiro: ");

        int num2 = scan.nextInt();

        int soma = num1 + num2;

        System.out.println("A soma dos numeros é: " + soma);

        scan.close();
    }
}
