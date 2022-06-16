package cursojava.aula18;

import java.util.Scanner;

public class BrakeContinue {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        int num = scan.nextInt();

        System.out.print("Entre com um limite: ");
        int max = scan.nextInt();

        for (int i = num; i <= max; i++) {
            if (i % 7 == 0) {
                System.out.println("O valor de i é: " + i);
                break;
            }
        }

        scan.close();
    }
}
