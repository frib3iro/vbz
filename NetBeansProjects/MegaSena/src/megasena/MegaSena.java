package megasena;

import java.util.Arrays;
import java.util.Random;

public class MegaSena {

    public static void main(String[] args) {
        Random r = new Random();

        int sena = 60;
        int[] array = new int[6];

        // Preenchendo o array
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(sena) + 1;
        }

        // Verificando se existem repetidos
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j] && j != i) {
                    array[i] = r.nextInt(sena) + 1;
                    i = 0;
                    j = 0;
                }
            }
        }

        // Ordenando o array
        Arrays.sort(array);

        // Imprimindo o array
        System.out.println("Imprimindo o array...");
        for (int i : array) {
            System.out.printf("%02d ", i);
        }

        System.out.println();

    }

}
