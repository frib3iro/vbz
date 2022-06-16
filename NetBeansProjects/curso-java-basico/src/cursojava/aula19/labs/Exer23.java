package cursojava.aula19.labs;

import java.util.Random;
import java.util.Scanner;

public class Exer23 {

    // Números palíndromos são aqueles que escritos da direita para a
    // esquerda têm o mesmo valor quando escritos da esquerda para a
    // direita. Exemplo: 545; 789987; 97379; 123454321; etc. Escreva um
    // programa que verifique se um dado vetor A de 10 elementos inteiros é
    // um palíndromo, ou seja, se o primeiro elemento do vetor e igual ao
    // último, se o segundo elemento do vetor é igual ao penúltimo e assim
    // por diante até verificar todos os elementos ou chegar a conclusão que
    // o vetor não é um palíndromo.
    
    public static void main(String[] args) {

        int[] array = new int[10];
        boolean palindromo = true;

        // geradorAleatorio(array);
        lendoDadosdoTeclado(array);
        System.out.println();
        imprimeArray(array);
        System.out.println();
        verificaPalindromo(array, palindromo);
        System.out.println();
        // imrprimeNaTela(palindromo);
        System.out.println();

    }

    // Lendo dados do teclado
    public static void lendoDadosdoTeclado(int[] array) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            array[i] = scan.nextInt();
        }
        scan.close();
    }

    // Gerando entrada de dados aleatoria
    public static void geradorAleatorio(int[] array) {
        Random r = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = r.nextInt(10) + 1;
        }
    }

    // Imprimindo o array na tela
    public static void imprimeArray(int[] array) {
        System.out.print("Array: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    // Verifica se é palindromo
    public static void verificaPalindromo(int[] array, boolean palindromo) {
        for (int i = 0; i < (array.length / 2); i++) {
            if (array[i] != array[array.length - 1 - i]) {
                palindromo = false;
                break;
            }
        }
        if (palindromo == true) {
            System.out.println("É palindromo");
        } else {
            System.out.println("Não é palindromo");
        }

    }

}
