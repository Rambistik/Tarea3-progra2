package tarea.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

//codigo reciclado de pa3p
class DepositoBebida {

    private ArrayList<Bebida> d;

    public DepositoBebida() {
        d = new ArrayList();
    }

    public void addBebida(Bebida k) {
        d.add(k);
    }

    public Bebida getBebida() {
        if (d.size() == 0) {
            return null;
        } else {
            Bebida v;
            v = d.remove(0);
            return v;
        }
    }

    public int getSize() {
        return d.size();
    }

    void Paint(Graphics g) {
        g.setColor(Color.white);
        g.fillRect(20, 20, 75, 400);
    }
}

class DepositoMonedas {

    private ArrayList<Moneda> c;

    public DepositoMonedas() {
        c = new ArrayList();
    }

    public void addMoneda(Moneda dinero) {
        c.add(dinero);
    }

    public Moneda getMoneda() {
        if (c.size() == 0) {
            return null;
        } else {
            Moneda x;
            x = c.remove(0);
            return x;
        }
    }

    public int getSize() {
        return c.size();
    }
    void Paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(300, 175, 75, 75);
    }
}

