package lezione_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Esercizi {
    public static void main(String[] args) {
        Scanner tastiera = new Scanner(System.in);
        // Es1
        /*System.out.println("Inserire numero");
        double n1 = Integer.parseInt(tastiera.nextLine());
        System.out.println("Inserire numero");
        double n2 = Integer.parseInt(tastiera.nextLine());
        System.out.println(n1 + n2);*/
        // Es2
        /*System.out.println("Inserire un numero");
        int n = Integer.parseInt(tastiera.nextLine());
        if(n % 2 == 0){
            System.out.println(n*2);
        }else{
            double d = n/2;
            System.out.println(d);
        }*/
        // Es3
        /*int somma = 0;
        for (int i = 0; i < 100; i++){
            if (i % 2 == 0){
                somma = somma + i;
            }
        }
        System.out.println(somma);*/
        // Es4
        String[] array = {"IlloJuan", "Jagger", "Diego", "Roberto", "Orslok", ""};
        List<String> nomi = Arrays.asList(array);
        for (int i = 0; i < nomi.size(); i++){
            String nome = nomi.get(i);
            if (nome.substring(0,1).equalsIgnoreCase("I")){
                nomi.remove(i);
            }
        }
        System.out.println(nomi);
        // Es5
    }
}
