package program;

public class Tarefa1 extends Thread {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("usando herança");
        }
    }
}
