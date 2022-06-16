package cursojava.aula19;

public class Arrays {

    public static void main(String[] args) {

        double[] temperatura = new double[20];
        temperatura[0] = 31.3;
        temperatura[1] = 32;
        temperatura[2] = 33.7;
        temperatura[3] = 34;
        temperatura[4] = 33.1;

        System.out.println("O valor da temperatura do dia 1 é: " + temperatura[0]);

        System.out.println("-------------------------------------------------");
        
        System.out.println("O tamanho do array é " + temperatura.length);
        
        System.out.println("-------------------------------------------------");
        
        System.out.println("Valores do array: " + temperatura);
        
        System.out.println("-------------------------------------------------");
        
        for (int i = 0; i < temperatura.length; i++) {
            System.out.println("O valor da temperatura do dia " + (i + 1) + ": " + temperatura[i]);
        }
        
        System.out.println("-------------------------------------------------");
        
        for (double temp : temperatura) {
            System.out.println("O valor da temperatura é: " + temp);
        }

    }

}
