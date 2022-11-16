package tarea.pkg3;

import tarea.pkg2.Expendedor.NoHayBebidaException;
import tarea.pkg2.Expendedor.PagoIncorrectoException;
import tarea.pkg2.Expendedor.PagoInsuficienteException;

class Comprador {

    private int vuelto;

    public Comprador(Moneda m, int cualBebida, Expendedor exp) {
        vuelto = 0;
        Bebida bebida;
        try {
            bebida = exp.comprarBebida(m,cualBebida);
        }catch(PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException e){
        } finally {
            Moneda d;
            do {
                d = e.getVuelto();
                if (d != null) {
                    vuelto += d.getValue();
                }
            } while (d != null);
        }

    }

    public int Vuelto() {
        return vuelto;
    }

}


