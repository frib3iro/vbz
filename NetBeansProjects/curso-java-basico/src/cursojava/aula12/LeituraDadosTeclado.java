package cursojava.aula12;

import java.util.Scanner;

public class LeituraDadosTeclado {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        /*
        System.out.print("Digite o seu nome completo: ");
        String nomeCompleto = scan.nextLine();
        System.out.println("O seu nome completo é: " + nomeCompleto);
        
        System.out.print("Digite seu promeiro nome: ");
        String primeiroNome = scan.next();
        System.out.println("Seu primeiro nome é: " + primeiroNome);
        
        
        System.out.print("Digite a sua idade: ");
        int idade = scan.nextInt();
        System.out.println("Sua idade é " + idade + " anos");
        
        System.out.print("Digite a sua altura: ");
        double altura = scan.nextDouble();
        System.out.println("Sua altura é " + altura);
        scan.close();
         */
        System.out.println("Digite seu nome, idade, quantidade de filhos, altura, e se tem bixo de estimação:");
        String nome = scan.next();
        int idade = scan.nextInt();
        byte qtdFilhos = scan.nextByte();
        float altura = scan.nextFloat();
        boolean temPet = scan.nextBoolean();

        System.out.println("Voce digitou os seguintes valores:");
        System.out.println("Nome: " + nome);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Quantidade de filhos: " + qtdFilhos);
        System.out.println("Altura: " + altura);
        System.out.println("Tem bixo de estimação: " + temPet);
    }
}
