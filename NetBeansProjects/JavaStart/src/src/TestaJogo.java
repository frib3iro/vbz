package src;

import ClassesBase.Dado;
import ClassesBase.Roleta;

public class TestaJogo {

    public static void main(String[] args) {

        Dado dd = new Dado();
        Roleta rl = new Roleta();

        dd.executaJogo(6);
        dd.mostraResultado();
        
        System.out.println("--");
        
        rl.executaJogo(35);
        rl.mostraResultado();
    }

}
