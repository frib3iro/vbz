package cursojava.testes;

import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {

    public static void main(String[] args) {

        Random r = new Random();
        Scanner scan = new Scanner(System.in);
        int num = 10;
        int[] array = new int[num];

        System.out.println("Indice dos valores:");
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        
        System.out.println("Preenchendo o vetor...");
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(num);
        }

        for (int i : array) {
            System.out.printf("%d ", i);
        }
        System.out.println();
        System.out.println();

        System.out.print("Digite o valor a ser buscado: ");
        int valorProcurado = scan.nextInt();
        System.out.println();
        

        for (int i = 0; i < array.length; i++) {
            if (array[i] == valorProcurado) {
                System.out.println("O valor achado é: " + array[i]);
                System.out.println("O indice do array é: " + i);
                System.out.println();
            }
        }
        scan.close();
    }
}
