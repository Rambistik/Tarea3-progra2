package tarea.pkg3;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import static java.lang.String.valueOf;

abstract class Bebida {

    private int saborBebida;
    private int precio;
    private int serie;
    private int x;
    private int y;

    public Bebida(int serie, int precio, int saborBebida) {
        this.saborBebida = saborBebida;
        this.precio = precio;
        this.serie = serie;
    }

    public int getSabor() {
        return saborBebida;
    }

    public int getPrecio() {
        return precio;
    }

    public int getSerie() {
        return serie;
    }

    public void paint(Graphics g) {

        Graphics2D exp = (Graphics2D) g;

        switch (saborBebida) {
            case 3 ->
                exp.setColor(Color.orange);
            case 2 ->
                exp.setColor(Color.green);
            case 1 ->
                exp.setColor(Color.red);
            default -> {
            }
        }

        exp.fillRect(x, y, 60, 30);
    }

    public abstract String beber();

    void setXY(int x, int y) {
        this.x = x;
        this.y = y;
    }

}

class CocaCola extends Bebida {

    public CocaCola(int precio, int serie, int sabor) {
        super(precio, serie, sabor);
    }

    public String beber() {
        System.out.println("Gluglu");
        return "Sprite";
    }

    class Sprite extends Bebida {

        public Sprite(int precio, int serie, int sabor) {
            super(precio, serie, sabor);
        }

        public String beber() {
            System.out.println("Gluglu");
            return "Sprite";
        }
    }

    class Fanta extends Bebida {

        public Fanta(int precio, int serie, int sabor) {
            super(precio, serie, sabor);
        }

        public String beber() {
            System.out.println("Gluglu");
            return "Fanta";
        }
    }
}
