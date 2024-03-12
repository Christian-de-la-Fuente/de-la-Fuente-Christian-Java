package lezione_6.forme;

public class Triangolo  extends Poligono {

    private int lato1;
    private int lato2;
    private int lato3;
    public Triangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public double area() {
        return base * altezza / 2;
    }

    @Override
    public double perimetro() {
        return lato1 + lato2 + lato3;
    }
}
