package teste;

import java.util.ArrayList;
import java.util.List;

public class Teste01 {

    public static void main(String[] args) {
        
        List<String> alunos = new ArrayList<>();
        
        alunos.add("Clara");
        alunos.add("Carlos");
        alunos.add("Sandro");
        alunos.add("Roberto");
        
        List<Double> notas = new ArrayList<>();
        
        notas.add(6.5);
        notas.add(8.4);
        notas.add(9.3);
        notas.add(7.9);
        
        for (int a = 0; a < alunos.size(); a++) {
            System.out.println(alunos.get(a) + " - " + notas.get(a));
        }
    }
}
