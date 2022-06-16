package cursojava.aula19.labs;

import java.util.Random;

public class Exer22 {

    // Criar um vetor A com 10 elementos inteiros. Desenvolver um programa
    // que verifique se "todos" os elementos do vetor A são pares. Se pelo
    // menos um elemento do vetor não for par o processo de repetição para
    // percorrer os elementos do vetor deve ser encerrado, como sugestão:
    // utilize uma variável do tipo flag para atingir este propósito.
    
    public static void main(String[] args) {

        Random r = new Random();

        int[] array = new int[10];

        // Preenchendo o array
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }
        System.out.println();

        // Verificando se é par
        System.out.print("Array par: ");
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                System.out.print(array[i] + " ");
            } else {
                break;
            }
        }
        System.out.println();

        // Imprimindo o array
        System.out.print("Array completo: ");
        for (int aux : array) {
            System.out.print(aux + " ");
        }
        System.out.println();
        System.out.println();
    }
}
