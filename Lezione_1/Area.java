import java.util.Scanner;
public class Area{
    public static void main(String args[]){
        Scanner tastiera = new Scanner(System.in);
        System.out.print("Inserisci la base: ");
        int base = Integer.parseInt(tastiera.nextLine());
        System.out.print("Inserisci la base: ");
        int altezza = Integer.parseInt(tastiera.nextLine());
        int area = base * altezza;
        System.out.println("L'area è: " + area);
    }
}