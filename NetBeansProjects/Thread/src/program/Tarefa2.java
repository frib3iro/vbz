package program;

public class Tarefa2 implements Runnable {

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("usando Runnable");
        }
    }
    
    
}
