package tarea.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;

class DepositoBebida {

    private int x, y;

    private ArrayList<Bebida> arrb;

    public DepositoBebida(int x, int y) {
        this.x = x;
        this.y = y;
        arrb = new ArrayList();
    }

    public void addBebida(Bebida k) {
        arrb.add(k);
        k.setXY(0, 400 - arrb.size() * 70);
    }

    public Bebida getBebida() {
        if (arrb.isEmpty()) {
            return null;
        } else {
            Bebida v;
            v = arrb.remove(0);
            return v;
        }
    }

    public int getSize() {
        return arrb.size();
    }

    void Paint(Graphics g, int x, int y) {
        g.setColor(Color.white);
        g.fillRect(x + this.x, y + this.y, 75, 400);
        g.setColor(Color.black);
        g.fillRect(20, 450, 275, 100);

        for (int i = 0; i < arrb.size(); i++) {
            arrb.get(i).setXY(20, 390 - 60 * (i + 1));
            arrb.get(i).paint(g, this.x + x, this.y + y);
        }
    }
}

class DepositoMonedas {

    private ArrayList<Moneda> arrmoneda;

    public DepositoMonedas() {
        arrmoneda = new ArrayList();
    }

    public void addMoneda(Moneda dinero) {
        arrmoneda.add(dinero);
    }

    public Moneda getMoneda() {
        if (arrmoneda.isEmpty()) {
            return null;
        } else {
            Moneda m;
            m = arrmoneda.remove(0);
            return m;
        }
    }

    public int getSize() {
        return arrmoneda.size();
    }

    void Paint(Graphics g) {
        g.setColor(Color.black);
        g.fillRect(310, 175, 75, 75);
    }
}
