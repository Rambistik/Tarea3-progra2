package tarea.pkg3;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JButton;

class Expendedor {

    private int precio;
    private int vuelto;
    private DepositoMonedas dm;
    private DepositoBebida dbCoca;
    private DepositoBebida dbSprite;
    private DepositoBebida dbFanta;

    public Expendedor(int precio, int cantidad) {
       
        this.precio = precio;

        dm = new DepositoMonedas();
        dbCoca = new DepositoBebida();
        dbSprite = new DepositoBebida();
        dbFanta = new DepositoBebida();

        for (int i = 0; i < cantidad; i++) {
            dbCoca.addBebida(new CocaCola(i + 100, precio, "Cola"));
            dbSprite.addBebida(new CocaCola(i + 200, precio, "Sprite"));
            dbFanta.addBebida(new CocaCola(i + 300, precio, "Fanta"));
        }
    }
    

    public void paint(Graphics g){
        g.setColor(Color.gray);
        g.fillRect(1, 1, 400, 600);
        dbCoca.Paint(g);
        dbSprite.Paint(g);
        dbFanta.Paint(g);
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
                    //
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
                    //
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
                    //
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
