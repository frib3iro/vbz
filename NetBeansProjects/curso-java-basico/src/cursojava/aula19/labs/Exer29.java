package cursojava.aula19.labs;

import java.util.Random;

public class Exer29 {

    // Ler um vetor A com 20 elementos. Construir dois vetores B e C, sendo
    // que nos vetor B e C serão armazenados o valores pares e ímpares de
    // A, respectivamente.
    public static void main(String[] args) {
        Random r = new Random();

        int[] vetA = new int[20];
        int[] vetB = new int[vetA.length];
        int[] vetC = new int[vetA.length];

        // Preenchendo os vetores A e B
        for (int i = 0; i < vetA.length; i++) {
            vetA[i] = r.nextInt(20) + 1;
        }

        // Armazenando valores pares
        for (int i = 0; i < vetA.length; i++) {
            if (vetA[i] % 2 == 0) {
                vetB[i] = vetA[i];
            } else {
                vetC[i] = vetA[i];
            }
        }
        
        // Mostrando vetA
        System.out.print("vetor A: ");
        for (int A : vetA) {
            System.out.print(A + " ");
        }
        System.out.println();
        
        // Mostrando vetB
        System.out.print("vetor B: ");
        for (int B : vetB) {
            System.out.print(B + " ");
        }
        System.out.println();
        
        // Mostrando vetC
        System.out.print("vetor C: ");
        for (int C : vetC) {
            System.out.print(C + " ");
        }
        System.out.println();
        

    }

}
