package teste;

public class Divisao {
    
    public static void main(String[] args) {
        
        int v1 = 10;
        int v2 = 0;
        System.out.println("Resultado da soma de " + v1 + " e " + v2 + " -> " + dividir(10, 0));
    }
    
    public static int dividir(int a, int b){
        int r = 0;
        try {
            String s[] = new String[5];
            s[6] = "Não existe este elemento da array";
            r = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Aconteceu um erro aritmético. Detalhes: " + e.getMessage());
        }
        catch(Exception e){
            System.out.println("Aconteceu um erro, não sei qual é.");
            System.out.println(e.getMessage());
        }
        return r;
    }
}
