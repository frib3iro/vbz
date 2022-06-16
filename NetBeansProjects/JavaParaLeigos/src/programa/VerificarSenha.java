package programa;

import java.util.Scanner;

public class VerificarSenha {

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Qual é a senha?");
        String senha = keyboard.next();

        System.out.println("Você digitou >>" + senha + "<<");

        if (senha == "swordfish") {
            System.out.println("A palavra digitada está " + "gravada");
            System.out.println("no mesmo lugar que a " + "verdadeira");
            System.out.println("senha. Você tem que ser");
            System.out.println("hacker");
        } else {
            System.out.println("A palavra digitada não está");
            System.out.println("gravada no mesmo lugar que a");
            System.out.println("senha verdadeira, mas não tem");
            System.out.println("problema.");
        }
        System.out.println("");

        
        if ("swordfish".equals(senha)) {
            System.out.println("A palavra digitada tem");
            System.out.println("os mesmos caracteres que a");
            System.out.println("senha real. pode usar o");
            System.out.println("sistema");
        } else {
            System.out.println("A palavra digitada não");
            System.out.println("tem os mesmos caracteres");
            System.out.println("que a senha real. não pode");
            System.out.println("usar o sistema");
        }
        keyboard.close();
    }
}
