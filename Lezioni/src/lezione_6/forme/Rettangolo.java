package lezione_6.forme;

public class Rettangolo extends Poligono {
    public Rettangolo(int base, int altezza) {
        super(base, altezza);
    }

    @Override
    public int area() {
        return base * altezza;
    }
}
