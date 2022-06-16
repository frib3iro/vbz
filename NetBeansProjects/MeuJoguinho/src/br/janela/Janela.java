package br.janela;

import javax.swing.JFrame;

public class Janela extends JFrame {

    int WIDTH = 540, HEIGHT = 480;

    public Janela() {
        setTitle("Game");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);
        setVisible(true);
    }
}
