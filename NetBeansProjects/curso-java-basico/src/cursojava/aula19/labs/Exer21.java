package cursojava.aula19.labs;

import java.util.Random;

public class Exer21 {

    //Gerar aleatoriamente um array A com 10 elementos inteiros e iguais a
    //0 e 1, sugestão: A[i] = (int)Math.round(Math.random() * 1); Pede-se
    //para implementar um programa que determine o percentual de
    //números 0's e 1's existentes no array A.
    
    public static void main(String[] args) {

        Random r = new Random();

        int somaUm = 0;
        double mediaUm = 0;
        int somaZero = 0;
        double mediaZero = 0;
        int[] array = new int[10];

        // Gera o array aleatorio
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(2);
        }

        // Mostra o array na tela
        System.out.print("Vetor: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();

        // Faz a soma
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                somaUm++;
                mediaUm = (somaUm * 100) / array.length;
            } else {
                somaZero++;
                mediaZero = (somaZero * 100) / array.length;
            }
        }
        
        System.out.println();
        System.out.println("A quantidade de uns: " + somaUm + " Porcentagem: " + mediaUm + "%");
        System.out.println();
        System.out.println("A quantidade de zeros: " + somaZero + " Porcentagem: " + mediaZero + "%");
        System.out.println();

    }

}
