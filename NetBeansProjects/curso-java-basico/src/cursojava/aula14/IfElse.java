package cursojava.aula14;

import java.util.Locale;
import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);
        /*
        System.out.print("Entre com sua idade: ");
        int idade = scan.nextInt();

        if (idade >= 18) {
            System.out.println("É maior de idade.");
        } else {
            System.out.println("Não é maior de idade.");
        }
        */
        System.out.print("entre com o preço do item: ");
        double valor = scan.nextDouble();

        if (valor <= 10) {
            System.out.println("Está barato pode comprar");
        } else if (valor > 10 && valor < 15) {
            System.out.println("Você pode pedir um desconto");
        } else if (valor >= 15 && valor < 17) {
            System.out.println("Pode pesquisar mais");
        } else {
            System.out.println("Muito caro");
        }

        scan.close();
    }
}
