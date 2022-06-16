package cursojava.aula20;

public class MatrizTridimensional {

    public static void main(String[] args) {

        int[][][] matrizTridimensinal = new int[3][3][3];

        for (int i = 0; i < matrizTridimensinal.length; i++) {
            for (int j = 0; j < matrizTridimensinal[i].length; j++) {
                for (int k = 0; k < matrizTridimensinal[i][j].length; k++) {
                    matrizTridimensinal[i][j][k] = i + j + k;

                }
            }
        }

        int soma = 0;
        int somaPares = 0;
        int somaImpar = 0;

        for (int i = 0; i < matrizTridimensinal.length; i++) {
            for (int j = 0; j < matrizTridimensinal[i].length; j++) {
                for (int k = 0; k < matrizTridimensinal[i][j].length; k++) {
                    soma += matrizTridimensinal[i][j][k];
                    if (matrizTridimensinal[i][j][k] % 2 == 0) {
                        somaPares += matrizTridimensinal[i][j][k];
                    } else {
                        somaImpar += matrizTridimensinal[i][j][k];
                    }
                }
            }
        }
        
        System.out.println("Soma total = " + soma);
        System.out.println("Soma pares = " + somaPares);
        System.out.println("Soma impares = " + somaImpar);
    }
}
