package program;

public class Main {

    public static void main(String[] args) {
        
        Thread threadComHeranca = new Tarefa1();
        Thread threadComRunnable = new Thread(new Tarefa2());
        
        threadComHeranca.start();
        threadComRunnable.start();
    }

}
