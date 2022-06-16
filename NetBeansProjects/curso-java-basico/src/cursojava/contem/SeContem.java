package cursojava.contem;

import java.util.Random;
import java.util.Scanner;

public class SeContem {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        Random r = new Random();

        int num = 10;
        int[] array = new int[num];

        // Preenchendo o array
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }

        // Imprimindo o array
        System.out.println("Imprimindo o array...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();
        System.out.println();

        System.out.print("Digite o valor a ser procurado: ");
        int numRepetido = s.nextInt();
        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (array[i] == numRepetido) {
                System.out.println("O número " + numRepetido + " está na posição " + i);
                array[i] = r.nextInt(10) + 1;
            }
        }
        System.out.println();
        
        // Imprimindo o array
        System.out.println("Imprimindo o array...");
        for (int i : array) {
            System.out.print(i + " ");
        }
        System.out.println();

        s.close();
    }
}
