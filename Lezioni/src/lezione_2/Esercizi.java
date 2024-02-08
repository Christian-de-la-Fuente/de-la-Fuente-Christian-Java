package lezione_2;

import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // Esercizio 1
        /*System.out.println("Inserire un numero:");
        int n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserire un numero:");
        int n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Che operazione vuoi fare?");
        String operazione = tastiera.nextLine();
        if(operazione.equals("somma")){
            System.out.println(n1 + n2);
        }else if(operazione.equals("sottrazione")){
            System.out.println(n1 - n2);
        }else if(operazione.equals("moltiplicazione")){
            System.out.println(n1 * n2);
        }else if(operazione.equals("divisione")){
            System.out.println(n1 / n2);
        }else{
            System.out.println("Operazione non riconosciuta");
        }*/
        // Esercizio 2
        System.out.println("Inserire gradi Fahrenheit:");
        double fahrenheit = Integer.parseInt(tastiera.nextLine());
        double celsius = (fahrenheit - 32) * 5 / 9;
        if(celsius <= 0){
            System.out.println(celsius + "ºC");
            System.out.println("Ghiaccio");
        }else if(celsius >= 100){
            System.out.println(celsius + "ºC");
            System.out.println("Vapore");
        }else{
            System.out.println(celsius + "ºC");
            System.out.println("Acqua");
        }
    }
}
