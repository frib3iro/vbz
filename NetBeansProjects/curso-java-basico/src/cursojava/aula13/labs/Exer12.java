package cursojava.aula13.labs;

import java.util.Locale;
import java.util.Scanner;

public class Exer12 {

    public static void main(String[] args) {
        // Tendo como dados de entrada a altura de uma pessoa, 
        // construa um algoritmo que calcule seu peso ideal, 
        // usando a seguinte fórmula: (72.7*altura) - 58
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Digite sua altura: ");
        double altura = scan.nextDouble();

        double peso = (72.7 * altura) - 58;

        System.out.println("Seu peso ideal é: " + peso);
        System.out.printf("Seu peso ideal é: %.2f\n", peso);
        scan.close();
    }
}
