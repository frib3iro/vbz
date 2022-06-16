package fabio.jogo;

import javax.swing.JFrame;

public class Janela extends JFrame{
    
    int WIDTH = 800, HEIGHT = 600;
    
    public Janela(){
        setTitle("Jogo");
        setSize(WIDTH, HEIGHT);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setResizable(false);
        setVisible(true);
    }
}
