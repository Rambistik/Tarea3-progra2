package tarea.pkg3;

import java.awt.*;
import javax.swing.*;

class PanelPrincipal extends JPanel {

    public PanelPrincipal() {
        super();
        setBackground(Color.black);
        setSize(1600, 1200);
        setVisible(true);
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.yellow);
        g.drawLine(600, 100, 200, 200);
    }
}
