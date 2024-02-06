package lezione_2.riscaldamento;

import java.util.Scanner;

/* Scrivere un programma che chiede in input due numeri e stampa la somma */
public class Es1 {
    // main
    public static void main(String[] args) {
        // alt + invio per importare velocemente
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero:");
        int n1 = Integer.parseInt(tastiera.nextLine());
        // sout
        System.out.println("Inserisci un numero:");
        int n2 = Integer.parseInt(tastiera.nextLine());
        int somma = n1 + n2;
        System.out.println("La somma è " + somma);
    }
}
