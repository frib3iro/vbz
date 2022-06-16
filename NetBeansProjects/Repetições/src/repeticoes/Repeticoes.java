package repeticoes;

public class Repeticoes {

    public static void main(String[] args) {

        System.out.println("-----------------");
        
        // Testando estruturas de Repetição
        System.out.println("Teste de While");
        int n = 0;
        while (n < 5) {
            System.out.println(n);
            n++;
        }
        System.out.println("-----------------");

        // Testando a estrutura do/While
        System.out.println("Teste de do/While");
        int i = 0;
        do {
            System.out.println(i);
            i++;
        } while (i < 5);
        System.out.println("-----------------");

        // Testando a estrutura for
        System.out.println("Teste de for");
        for (int z = 0; z < 5; z++) {
            System.out.println(z);
        }
        System.out.println("-----------------");
    }
}
