package fabio.jogo;

import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

public class Fase extends JPanel implements ActionListener{

    private Image fundo;
    private Nave nave;
    private Timer timer;

    public Fase() {
        ImageIcon referencia = new ImageIcon("res\\fundo.png");
        fundo = referencia.getImage();
        nave = new Nave();
        timer = new Timer(5, this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        nave.mexer();
        repaint();
    }

}
