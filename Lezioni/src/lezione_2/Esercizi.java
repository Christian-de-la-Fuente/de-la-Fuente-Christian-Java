package lezione_2;

import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire un numero:");
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
        }
    }
}
