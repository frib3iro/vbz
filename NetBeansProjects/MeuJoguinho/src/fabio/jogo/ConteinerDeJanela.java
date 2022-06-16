package fabio.jogo;

import javax.swing.JFrame;

public class ConteinerDeJanela extends JFrame {

    int width = 540, heigth = 480;

    public ConteinerDeJanela() {
        setTitle("Meu Jogo");
        setSize(width, heigth);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }

    public static void main(String[] args) {

        new ConteinerDeJanela();
    }
}
