package lezione_3;

import java.util.Scanner;

public class Esercizi {
    /*
    Es1: (if-else) Chiedere un numero e stampare "Pari" o "dipari"
    Es2: (for) Chiedere quante temperature si vuole inserire
    stampare il minimo, massimo e la media (senza array).
    Es3: (for - ArrayList) salvare le temperature precedenti
    stampare quelle maggiori di 10 gradi
    Es4: (while) chiedere all'utente dei numeri e sommarli finché
    non schive 0 (terminare quando inserisce 0)
    Es5: (String, substring) stampare il proprio nome al contrario
     */
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // Es1
        /* System.out.println("Inserisci un numero:");
        int num = Integer.parseInt(tastiera.nextLine());
        if (num % 2 == 0){
            System.out.println(num);
            System.out.println("Pari");
        }else{
            System.out.println(num);
            System.out.println("Dispari");
        }*/
        // Es2
        System.out.println("Quante temperature vuoi inserire:");
        int ts = Integer.parseInt(tastiera.nextLine());
        double tempMin = -100;
        double tempMax = 100;
        double somma = 0;

        for (int i = 0; i < ts; i++){
            System.out.println("Inserisci la temperatura");
            double t = Integer.parseInt(tastiera.nextLine());
            somma += t;

        }
    }
}
