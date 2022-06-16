package megasena;

import java.util.Random;

public class Mega {

    int sena = 60;
    int[] array = new int[6];

    // Preenchendo o array
    public int[] criaArray() {
        Random r = new Random();
        for (int i = 0; i < this.array.length; i++) {
            this.array[i] = r.nextInt(sena) + 1;
        }
        return this.array;
    }

    // Verificando se existem repetidos
    public int[] verificaSeExiste() {
        Random r = new Random();
        for (int i = 0; i < this.array.length; i++) {
            for (int j = 0; j < this.array.length; j++) {
                if (this.array[i] == this.array[j] && j != i) {
                    this.array[i] = r.nextInt(sena) + 1;
                    i = 0;
                    j = 0;
                }
            }
        }
        return this.array;
    }

    public void imprimeArray() {
        // Imprimindo o array
        System.out.println("Imprimindo o array...");
        for (int i : array) {
            System.out.printf("%02d ", i);
        }
    }
}
