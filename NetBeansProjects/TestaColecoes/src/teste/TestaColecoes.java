package teste;

import java.util.ArrayList;
import java.util.List;

public class TestaColecoes {

    public static void main(String[] args) {
        
        List<String> diasSemana = new ArrayList<>();
        List<Double> notas = new ArrayList<>();
        
        diasSemana.add("Domingo");
        diasSemana.add("Segunda");
        diasSemana.add("Terça");
        diasSemana.add("Quarta");
        diasSemana.add("Quinta");
        diasSemana.add("Sexta");
        diasSemana.add("Sábado");
        
        notas.add(4.5);
        notas.add(8.4);
        notas.add(9.3);
        
        System.out.println(notas);
        System.out.println(notas.get(2));
        System.out.println(diasSemana);
    }
}