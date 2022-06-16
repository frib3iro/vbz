package br.nave;

import java.awt.Image;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

public class Nave {

    private int x, y;
    private int dx, dy;
    private Image imagem;

    public Nave() {
        ImageIcon referencia = new ImageIcon("res\\nave.gif");
        imagem = referencia.getImage();
        this.x = 100;
        this.y = 100;
    }

    public void mexer() {
        x += dx;
        y += dy;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public Image getImage() {
        return imagem;
    }

    public void keyPressed(KeyEvent tecla) {

        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = -1;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 1;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = -1;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = -1;
        }
    }

    public void keyRelease(KeyEvent tecla) {

        int codigo = tecla.getKeyCode();

        if (codigo == KeyEvent.VK_UP) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_DOWN) {
            dy = 0;
        }
        if (codigo == KeyEvent.VK_LEFT) {
            dx = 0;
        }
        if (codigo == KeyEvent.VK_RIGHT) {
            dx = 0;
        }
    }

}
