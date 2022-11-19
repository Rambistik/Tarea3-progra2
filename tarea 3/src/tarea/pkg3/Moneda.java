package tarea.pkg3;

abstract class Moneda {
    

    public Moneda() {

    }

    public String getSerie() {
        return this.toString();
    }

    abstract int getValue();
}

class Moneda100 extends Moneda {

    public Moneda100() {
    }
    @Override
    public int getValue() {
        return 100;
    }
}

class Moneda500 extends Moneda {

     public Moneda500() {
    }
    @Override
    public int getValue() {
        return 500;
    }
}

class Moneda1000 extends Moneda {

   public Moneda1000() {
    }
    @Override
    public int getValue() {
        return 1000;
    }
}

