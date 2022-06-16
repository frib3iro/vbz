package testes;

public class SplitTeste {
    
    public static void main(String[] args) {        
        
        String s = "batata, melao, abacaxi, melancia, maça";
        
        String[] vetor = s.split(",");
        
        for (String i : vetor) {
            System.out.print(i + " ");
        }
        System.out.println();
        
    }
}
