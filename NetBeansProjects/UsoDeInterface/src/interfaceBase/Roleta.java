package interfaceBase;

import java.util.Random;

public class Roleta extends Jogo {

    @Override
    public void executaJogo() {
        Random rnd = new Random();
        this.setResultado(rnd.nextInt(37));
    }

}
