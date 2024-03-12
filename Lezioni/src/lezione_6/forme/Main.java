package lezione_6.forme;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Poligono> forme = new ArrayList<>();
        forme.add(new Triangolo(10, 15));
        forme.add(new Quadrato(10.00));
        forme.add(new Rettangolo(10, 20));
        for(Poligono p: forme){
            System.out.println(p.area());
        }
        System.out.println(forme.get(0).area() + forme.get(1).area() + forme.get(2).area());
    }

    @Override
    public String toString() {
        return "Quadrato: lato = ";
    }
}
