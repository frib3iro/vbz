package inicio_logica_games;

public class Game1 implements Runnable {

    public boolean isRunning;
    private Thread thread;
    
    public static void main(String[] args) {
        Game1 game = new Game1();
        game.start();
    }

    public synchronized void start() {
        isRunning = true;
        thread = new Thread(this);
        thread.start();
    }

    public void tick() {
        // Atualizar o jogo
        System.out.println("Tick");
    }

    public void render() {
        // Renderizar o jogo
        System.out.println("Render");
    }

    @Override
    public void run() {
        while (isRunning) {
            tick();
            render();
            try {
                thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
