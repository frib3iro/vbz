package fabio.array;

public class EncontrarMaiorValorArray {

    public static void main(String[] args) {

        int[] vetor1 = {5, 3, 6, 7, 1, 8, 9, 10, 8, 4, 3};
        int maior1 = buscarMaior(vetor1);
        System.out.println("O maior valor do vetor é: " + maior1);
    }

    private static int buscarMaior(int[] vetor2) {
        int maior2 = 0;
        for (int i = 0; i < vetor2.length; i++) {
            if (maior2 < vetor2[i]) {
                maior2 = vetor2[i];
            }
        }
        return maior2;
    }
}
