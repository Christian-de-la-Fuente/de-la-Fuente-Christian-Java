package lezione_6.forme;

public class Quadrato extends Poligono {
    public Quadrato(double lato) {
        super(lato, lato);
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
