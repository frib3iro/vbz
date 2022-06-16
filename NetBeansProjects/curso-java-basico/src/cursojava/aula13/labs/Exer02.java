package cursojava.aula13.labs;

import java.util.Scanner;

public class Exer02 {

    public static void main(String[] args) {

        // Faça um Programa que peça um número e então mostre a mensagem O número informado foi [número].
        Scanner scan = new Scanner(System.in);

        System.out.print("Digte um numero inteiro: ");

        int numero = scan.nextInt();

        System.out.println("o numero digitado foi: " + numero);

        scan.close();

    }

}
