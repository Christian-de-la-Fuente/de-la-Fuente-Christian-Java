package lezione_6;

import lezione_5.Bottiglia;

public class TipoRealeApparente {
    public static void main(String[] args) {
        Bottiglia a = new Bottiglia(500);
        Bottiglia b = new Bottiglia(600);
        BottigliaConTappo c = new BottigliaConTappo(500);
        Bottiglia d = new BottigliaConTappo(600);
        a.riempi(500);
        c.apri();
        BottigliaConTappo e = (BottigliaConTappo) d;
        ((BottigliaConTappo) d).chiudi();
        e = new BottigliaConTappo(500);
    }
}
