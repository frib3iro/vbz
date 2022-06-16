package game;

import graficos.CarregarImagem;
import java.awt.*;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable {

    public static JFrame frame;
    public static final int LARGURA = 320, ALTURA = 320;
    public static final int ESCALA = 2;

    private Thread thread;
    private boolean isRunning = true;
    private int frames = 0;

    private final BufferedImage image;
    
    private Image img;

    public Game() {
        this.setPreferredSize(new Dimension(LARGURA * ESCALA, ALTURA * ESCALA));
        initFRame();
        image = new BufferedImage(LARGURA, ALTURA, BufferedImage.TYPE_INT_RGB);
        startGame();
    }

    private void startGame() {
        img = new CarregarImagem().pegarImagem("res//PlanoCart.gif");
    }
    
    private void initFRame() {
        frame = new JFrame("Java Game 2D");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void run() {
        requestFocus(); // Chamar a atenção do windows
        long lasttime = System.nanoTime();
        double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        double timer = System.currentTimeMillis();

        // Loop Game
        while (isRunning) {
            long now = System.nanoTime();
            delta += (now - lasttime) / ns;
            lasttime = now;
            if (delta >= 1) {
                tick();
                render();
                frames++;
                delta--;
            }

            if (System.currentTimeMillis() - timer >= 1000) {
                //System.out.println("FPS: " + frames);
                frame.setTitle("Game2D FPS: " + frames);
                frames = 0;
                timer += 1000;
            }
        }

        stop();
    }

    private void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {

        }
    }

    public synchronized void start() {
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    private void tick() {
    }

    private void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        // render do game, pintando a tela de fundo
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, LARGURA, ALTURA);
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, LARGURA * ESCALA, ALTURA * ESCALA, null);
        
//        g.setColor(new Color(255, 0, 0));
//        g.setFont(new Font("arial", Font.BOLD, 30));
//        g.drawString("Game2D", 25, 550);

        Graphics2D g2d = (Graphics2D) g;
        g2d.drawImage(img, 50, 50, null);
        
        bs.show();
        g.dispose();
    }


}
