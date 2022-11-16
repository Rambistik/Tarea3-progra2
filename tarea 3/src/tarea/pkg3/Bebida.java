
package tarea.pkg3;

abstract class Bebida {

    private String saborBebida;
    private int precio;
    private int serie;

    public Bebida(int serie, int precio, String saborBebida) {
        this.saborBebida = saborBebida;
        this.precio = precio;
        this.serie = serie;
    }

    public String getSabor() {
        return saborBebida;
    }

    public int getPrecio() {
        return precio;
    }

    public int getSerie() {
        return serie;
    }

    public abstract String beber();

}

    class CocaCola extends Bebida {

    public CocaCola(int precio, int serie, String sabor) {
        super(precio, serie, sabor);
    }

    public String beber() {
        System.out.println("Gluglu");
        return "Sprite";
    }

    class Sprite extends Bebida {

        public Sprite(int precio, int serie, String sabor) {
            super(precio, serie, sabor);
        }

        public String beber() {
            System.out.println("Gluglu");
            return "Sprite";
        }
    }

    class Fanta extends Bebida {

        public Fanta(int precio, int serie, String sabor) {
            super(precio, serie, sabor);
        }

        public String beber() {
            System.out.println("Gluglu");
            return "Fanta";
        }
    }
}