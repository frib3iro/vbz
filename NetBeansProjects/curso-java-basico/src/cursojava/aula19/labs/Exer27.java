package cursojava.aula19.labs;

import java.util.Random;

public class Exer27 {

    // Ler um vetor A com 10 elementos e construir um vetor B de mesmo
    // tipo e tamanho e com os mesmos elementos de A, sendo que estes
    // deverão estar invertidos, ou seja, o primeiro elemento de A passa a
    // ser o último de B, o segundo elemento de A passa a ser o penúltimo
    // de B e assim por diante.
    
    public static void main(String[] args) {
        Random rand = new Random();

        int[] A = new int[10];
        int[] B = new int[A.length];

        // Preenchendo o vetor A
        for (int i = 0; i < A.length; i++) {
            A[i] = rand.nextInt(11);
        }

        // Imprimindo o vetor A
        System.out.print("Vetor A: ");
        for (int vetor : A) {
            System.out.print(vetor + " ");
        }
        
        System.out.println();
        
        // Prenchendo vetor B
        for (int i = 0; i < A.length; i++) {
            B[i] = A[A.length - 1 - i];
        }
        
        // Imprimindo vetor B
        System.out.print("Vetor B: ");
        for (int vetor : B) {
            System.out.print(vetor + " ");
        }
        
        System.out.println();
        System.out.println();
    }
}
