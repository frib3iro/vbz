package EstruturasRepetitivas;

import java.util.Locale;
import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        char resp;
        do {
            System.out.print("Digite a temperatura em celcius: ");
            double C = scan.nextDouble();
            double F = 9.0 * C / 5.0 + 32;
            System.out.printf("Equivalente em Fahrenheit: %.1f\n", F);
            System.out.print("Deseja repetir (s/n)? ");
            resp = scan.next().charAt(0);
        } while (resp != 'n');

    }

}
