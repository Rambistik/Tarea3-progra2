package tarea.pkg3;

import javax.swing.JFrame;
import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class Ventana extends JFrame {

    public Ventana() {
        setSize(800, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        PanelPrincipal panel = new PanelPrincipal();
        add(panel);
    }
}
