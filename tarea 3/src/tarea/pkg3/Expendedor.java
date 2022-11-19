package tarea.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import java.io.IOException;
import javax.imageio.ImageIO;

class Expendedor {

    private int precio;
    private int vuelto;
    private DepositoMonedas dm;
    private DepositoBebida dbCoca;
    private DepositoBebida dbSprite;
    private DepositoBebida dbFanta;
    private BufferedImage CocaCola;
    private BufferedImage fanta;
    private BufferedImage sprite;
    private int x;
    private int y;

    public Expendedor(int precio, int cantidad, int x , int y) {

        this.precio = precio;
        this.x = x;
        this.y = y;

        dm = new DepositoMonedas();
        dbCoca = new DepositoBebida(10,10); 
        dbSprite = new DepositoBebida(100,10);
        dbFanta = new DepositoBebida(190,10);

        for (int i = 0; i < cantidad; i++) {
            dbCoca.addBebida(new CocaCola(i + 100, precio, 3));
            dbSprite.addBebida(new CocaCola(i + 200, precio, 2));
            dbFanta.addBebida(new CocaCola(i + 300, precio, 1));
        }
    }

    public void paint(Graphics g) {
        g.setColor(Color.gray);
        g.fillRect(x, y, 400, 600);
        dbCoca.Paint(g, x, y);
        dbSprite.Paint(g, x, y);
        dbFanta.Paint(g, x, y);
        dm.Paint(g);

    }

    public void CalVuelto(int DinIngresado) {
        int VueltoADevolver = (DinIngresado - this.precio) / 100;

        for (int i = 0; i < VueltoADevolver; i++) {
            dm.addMoneda(new Moneda100());
        }
    }

    public void mensajesVuelto() {
        if (dm.getSize() != 0) {
            System.out.println("100");
        } else {
            System.out.println("tomaste todo el vuelto");
        }
    }

    public Moneda getVuelto() {
        return dm.getMoneda();
    }

    public Bebida comprarBebida(Moneda mon, int saborbebida) throws PagoInsuficienteException, NoHayBebidaException, PagoIncorrectoException {
        if (mon != null) {
            //Coca=1;Fanta=2;Sprite=3;
            Bebida aux;
            int precioBebida;
            if (saborbebida == 1) {
                aux = dbCoca.getBebida();
                if (aux == null) {

                    dm.addMoneda(mon);
                    throw new NoHayBebidaException();
                } else {
                    if (mon.getValue() < aux.getPrecio()) {
                        dbCoca.addBebida(aux);
                        throw new PagoInsuficienteException();
                    }
                }
            }
            if (saborbebida == 2) {
                aux = dbFanta.getBebida();
                if (aux == null) {

                    dm.addMoneda(mon);
                    throw new NoHayBebidaException();
                } else {
                    if (mon.getValue() < aux.getPrecio()) {
                        dbFanta.addBebida(aux);
                        throw new PagoInsuficienteException();
                    }
                }
            }
            if (saborbebida == 3) {
                aux = dbSprite.getBebida();
                if (aux == null) {

                    dm.addMoneda(mon);
                    throw new NoHayBebidaException();
                } else {
                    if (mon.getValue() < aux.getPrecio()) {
                        dbSprite.addBebida(aux);
                        throw new PagoInsuficienteException();
                    }
                }
            }

        } else {
            throw new PagoIncorrectoException();
        }
        return null;
    }

    class PagoInsuficienteException extends Exception {

        public PagoInsuficienteException() {
            super("Dinero insuficiente");
        }
    }

    class PagoIncorrectoException extends Exception {

        public PagoIncorrectoException() {
            super("Pago incorrecto");
        }
    }

    class NoHayBebidaException extends Exception {

        public NoHayBebidaException() {
            super("Deposito de bebidas vacio");
        }
    }

}
