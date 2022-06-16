package cursojava.testes;

import java.util.Random;
import java.util.Scanner;

public class Palindromo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random r = new Random();

        int[] array = new int[10];
        boolean palindromo = true;

        // Lendo dados do teclado
        // for (int i = 0; i < array.length; i++) {
        //     System.out.print("Digite o número da posição " + i + ": ");
        //     array[i] = scan.nextInt();
        // }

        // Gerando entrada de dados aleatoria
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }

        // Imprimindo o array na tela
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
        System.out.println();

        // Verifica se é palindromo
        System.out.println("Palindromo: ");
        for (int i = 0; i < (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }

        // Imprimindo na atela
        if (palindromo) {
            System.out.println("palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

        System.out.println();
        System.out.println();
        scan.close();
    }

}
