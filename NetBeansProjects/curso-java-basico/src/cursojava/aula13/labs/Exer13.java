package cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer13 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        // Tendo como dados de entrada a altura e o sexo de uma pessoa,
        // construa um algoritmo que calcule seu peso ideal, utilizando as
        // seguintes fórmulas:
        // a. Para homens: (72.7*h) - 58
        // b. Para mulheres: (62.1*h) - 44.7 (h = altura)
        // c. Peça o peso da pessoa e informe se ela está dentro, acima ou
        // abaixo do peso.

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        System.out.print("Digite o seu sexo: ");
        char sexo = scan.next().charAt(0);

//        if (sexo == 'M') || (sexo == 'm') {
        scan.close();
    }

}
