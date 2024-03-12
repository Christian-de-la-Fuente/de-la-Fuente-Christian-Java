package lezione_6.forme;

public class Rettangolo extends Poligono {
    public Rettangolo(double base, double altezza) {
        super(base, altezza);
    }

    @Override
    public double area() {
        return base * altezza;
    }

    @Override
    public double perimetro() {
        return (base + altezza) * 2;
    }
}
