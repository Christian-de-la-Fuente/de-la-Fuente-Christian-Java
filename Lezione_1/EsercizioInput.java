import java.util.Scanner;
public class EsercizioInput{
    public static void main(String args[]){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci un nome: ");
        String nome = tastiera.nextLine();
        System.out.print("Inserisci un nome: ");
        String cognome = tastiera.nextLine();
        System.out.print("Inserisci l'eta: ");
        int eta = Integer.parseInt(tastiera.nextLine());
        System.out.println("Ciao " + nome + " " + cognome);
        System.out.println("Il doppio della tua età è: " + eta * 2);
    }
}