package tarea.pkg3;

import tarea.pkg3.Expendedor.NoHayBebidaException;
import tarea.pkg3.Expendedor.PagoIncorrectoException;
import tarea.pkg3.Expendedor.PagoInsuficienteException;

class Comprador {

    private int vuelto;
    private String sabor;

    public Comprador(Expendedor exp) {
        vuelto = 0;
        Bebida bebida;
        /*try { 
            bebida = exp.comprarBebida(); 
            sabor = bebida.beber();
            System.out.println("gluglu");
        }catch(PagoIncorrectoException | NoHayBebidaException | PagoInsuficienteException e){
       sabor = null;
            System.out.println(e.getMessage());
        } finally {
            Moneda d;
            do {
                d = exp.getVuelto();
                if (d != null) {
                    vuelto += d.getValue();
                }
            } while (d != null);
        }
*/
    }

    public int Vuelto() {
        return vuelto;
    }
    public String sabor(){
        return sabor;
          }

}


