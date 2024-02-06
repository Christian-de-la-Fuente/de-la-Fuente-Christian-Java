package lezione_2;

import java.util.Scanner;

public class EsempioEquals {
    public static void main(String[] args) {
        String nome = "Filippo";
        // Modo svagliato per confrontare gli oggetti
        System.out.println(nome == "AFilippo".substring(1));
        // modo corretto:
        System.out.println(nome.equals("AFilippo".substring(1)));
        System.out.println(nome.equalsIgnoreCase("ffilippo".substring(1)));

        Scanner tastiera = new Scanner(System.in);
        System.out.println("Inserire nome utente: ");
        String utente = tastiera.nextLine();
        System.out.println("Inserire password: ");
        String password = tastiera.nextLine();
        boolean condizione = utente.equals("utente") && password.equals("password");
        System.out.println(condizione);
        if(condizione){
            System.out.println("Messaggio segreto");
        }else{
            System.out.println("User e/o password errati");
        }
    }
}
