package lezione_2;

import java.util.Scanner;

public class Booleani {
    public static void main(String[] args) {
        boolean a = true, b = false;
        System.out.println(a);
        System.out.println(!a);
        System.out.println(b);
        System.out.println(!b);
        System.out.println(a && a);
        System.out.println(a || a);
        System.out.println(b && a);
        System.out.println(b || a);
        System.out.println(a && b);
        System.out.println(a || b);
        System.out.println(b && b);
        System.out.println(b || b);

        // == != <> <= >=

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserisci un numero");
        int numero = Integer.parseInt(tastiera.nextLine());
        boolean condizione = numero >= 18;
        System.out.println(condizione);

        // chiedere all'utente un numero
        // stampare true se un voto insufficiente (cioè
        // tra 0 e 5

        numero = Integer.parseInt(tastiera.nextLine());
        condizione = 0 <= numero && numero <= 5;
        System.out.println(condizione);

        // chiedere un numero, true se è pari

        numero = Integer.parseInt(tastiera.nextLine());
        condizione = numero % 2 == 0;
        System.out.println(condizione);

        // dato un anno, stampare true se è bisestile
        // un anno è bisestile se
        // - è divisibile per 4 && ! per 100
        // - oppure è divisibile per 400
        // 2024: SI
        // 1900: NO
        // 2023: NO
        // 2000: SI

        numero = Integer.parseInt(tastiera.nextLine());
        condizione = (numero % 4 == 0) && ! (numero % 100 == 0) || (numero % 400 == 0);
        System.out.println(condizione);
    }
}
