package cursojava.aula19.labs;

public class Exer31 {

    //Criar um vetor A com 5 elementos inteiros. Escreva um programa que
    //imprima a tabuada de cada um dos elementos do vetor A.
    
    public static void main(String[] args) {

        int[] vetorA = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < vetorA.length; i++) {
            System.out.println("tabuada do " + vetorA[i]);
            for (int j = 1; j <= 10; j++) {
                System.out.println(vetorA[i] + " x " + j + " = " + (vetorA[i] * j));
            }
            System.out.println();
        }
    }

}
