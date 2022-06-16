package br;

import br.display.Display;
import br.states.StateManager;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Game implements Runnable {

    private Display display;
    private Thread thread;
    private boolean running = false;
    public static int width = 400, height = 300;
    private StateManager sm;

    public Game() {
        display = new Display("Pong", 400, 300);
        sm = new StateManager();
    }

    @Override
    public void run() {
        init();
        int FPS = 60;
        double timePerTick = 1999999999 / FPS;
        double delta = 0;
        long now;
        long lastTime = System.nanoTime();

        while (running) {
            now = System.nanoTime();
            delta += (now - lastTime) / timePerTick;
            lastTime = now;

            if (delta >= 1) {
                update();
                render();
                delta--;
            }
        }
        stop();
    }

    private void init() {
    }

    private void update() {
        if (StateManager.getState() == null) {
            return;
        }
        sm.update();
    }

    private void render() {
        BufferStrategy bs = display.getBufferStrategy();
        if (bs == null) {
            display.createBufferStrategy();
            bs = display.getBufferStrategy();
        }

        Graphics g = bs.getDrawGraphics();
        g.clearRect(0, 0, width, height);
        if (StateManager.getState() != null) {
            sm.render(g);
        }
        sm.render(g);
        g.dispose();
        bs.show();
    }

    public synchronized void start() {
        if (thread != null) {
            return;
        }
        thread = new Thread(this);
        thread.start();
        running = true;
    }

    public synchronized void stop() {
        if (thread == null) {
            return;
        }
        try {
            thread.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Game.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
