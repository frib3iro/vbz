package fabio.game;

package game;

import fabio.fogo.Fogo;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;
import javax.swing.JFrame;

public class Game extends Canvas implements Runnable, KeyListener {

    private static final long serialVersionUID = 1L;
    public static JFrame frame;
    private Thread thread;
    private boolean isRunning = true;
    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;
    public static final int SCALE = 1;

    private BufferedImage image;

    Fogo fogo = new Fogo();

    public Game() {
        addKeyListener(this);
        setPreferredSize(new Dimension(WIDTH * SCALE, HEIGHT * SCALE));
        initFRame();

        image = new BufferedImage(WIDTH, HEIGHT, BufferedImage.TYPE_INT_RGB);
    }

    public void initFRame() {
        frame = new JFrame("Fire Doom");
        frame.add(this);
        frame.setResizable(false);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    public synchronized void start() {
        thread = new Thread(this);
        isRunning = true;
        thread.start();
    }

    public synchronized void stop() {
        isRunning = false;
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void tick() {
        fogo.tick();
    }

    public void render() {
        BufferStrategy bs = this.getBufferStrategy();
        if (bs == null) {
            this.createBufferStrategy(3);
            return;
        }
        Graphics g = image.getGraphics();
        g.setColor(new Color(0, 0, 0));
        g.fillRect(0, 0, WIDTH, HEIGHT);
        Graphics2D g2 = (Graphics2D) g;
        g.setColor(Color.YELLOW);
        //g.drawString("Renderização do jogo", 600, 20);
        fogo.render(g);
        g.dispose();
        g = bs.getDrawGraphics();
        g.drawImage(image, 0, 0, WIDTH * SCALE, HEIGHT * SCALE, null);
        g.setFont(new Font("arial", Font.BOLD, 20));
        g.setColor(Color.white);
        //g.drawString("Teste render tela", 20, 580);
        bs.show();
    }

    @Override
    public void run() {
        long lasttime = System.nanoTime();
        double amountOfTicks = 10.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int frames = 0;
        double timer = System.currentTimeMillis();
        requestFocus();
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
                  frame.setTitle("FireDoom FPS: " + frames);
                frames = 0;
                timer += 1000;
            }
        }
        stop();
    }

    @Override
    public void keyPressed(KeyEvent e) {
    }

    @Override
    public void keyReleased(KeyEvent e) {
    }

    @Override
    public void keyTyped(KeyEvent e) {
    }

}
