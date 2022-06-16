package cursojava.testes;

import java.util.Locale;
import java.util.Scanner;

public class LocaleUS {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        double x;
        x = scan.nextDouble();
        System.out.println("Voce digitou: " + x);
        System.out.printf("Voce digitou: %.2f\n", x);
        scan.close();
    }
}
