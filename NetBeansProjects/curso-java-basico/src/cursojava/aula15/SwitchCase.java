package cursojava.aula15;

import java.util.Locale;
import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int diaSemana = scan.nextInt();

        if (diaSemana == 1) {
            System.out.println("Domingo");
        } else if (diaSemana == 2) {
            System.out.println("Segunda");
        } else if (diaSemana == 3) {
            System.out.println("Terça");
        } else if (diaSemana == 4) {
            System.out.println("Quarta");
        } else if (diaSemana == 5) {
            System.out.println("Quinta");
        } else if (diaSemana == 6) {
            System.out.println("Sexta");
        } else if (diaSemana == 7) {
            System.out.println("Sabado");
        }
        scan.close();
    }
}
