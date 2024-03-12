package lezione_6.forme;

public abstract class Poligono {
    public double base;
    public double altezza;

    public Poligono(double base, double altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public double area () {
        return 0;
    }

    public double perimetro () {
        return 0;
    }
}
