package cursojava.aula19.labs;

import java.util.Random;

public class Exer32 {

    // Criar um vetor A com 10 elementos inteiros. Escreva um programa que
    // imprima cada elemento do vetor A e uma mensagem indicando se o
    // respectivo elemento é um número primo ou não.
    // Um número é divisível por outro quando o resto da divisão entre os dois 
    // é igual a zero. 
    
    public static void main(String[] args) {
        Random r = new Random();
        
        int[] A = new int[10];
        
        for (int i = 0; i < A.length; i++) {
            A[i] = r.nextInt(10) + 1;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] % 1 == 0 || A[i] % A[i] == 0) {
                System.out.println(A[i] + " É primo");
                System.out.println();
            } else {
                System.out.println(A[i] + " Não é primo");
                System.out.println();
            }
        }

    }
}
