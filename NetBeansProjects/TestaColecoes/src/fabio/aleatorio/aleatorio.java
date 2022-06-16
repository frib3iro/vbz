package fabio.aleatorio;

import java.util.Arrays;
import java.util.Random;

public class aleatorio {

    public static void main(String[] args) {

        int num1 = 20;
        int[] vetor1 = new int[num1];

        System.out.println("O vetor preenchido é: " + Arrays.toString(preencheVetor(vetor1)));

        int maior1 = buscaMaior(vetor1);
        System.out.println("O maior valor do vetor é: " + maior1);
    }

    private static int buscaMaior(int[] vetor2) {
        int maior2 = 0;
        for (int i = 0; i < vetor2.length; i++) {
            if (maior2 < vetor2[i]) {
                maior2 = vetor2[i];
            }
        }
        return maior2;
    }

    private static int[] preencheVetor(int[] vetor3) {
        Random r = new Random();
        for (int i = 0; i < vetor3.length; i++) {
            vetor3[i] = r.nextInt(60) + 1;
        }
        return vetor3;
    }

}
