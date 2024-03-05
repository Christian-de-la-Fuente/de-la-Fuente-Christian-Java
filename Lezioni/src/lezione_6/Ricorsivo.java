package lezione_6;

public class Ricorsivo {

    public static int fattoriale(int x) {
        // se x == 0 il fattoriale è 1
        // altrimenti è x * (x -1)!
        if(x == 0){
            return 1;
        }else {
            return x * fattoriale(x - 1);
        }
    }

    public static int fibonacci(int n) {
        if(n == 0){
            return 0;
        }else if(n == 1){
            return 1;
        }else{
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

    public static String rovesciaStringa(String x) {
        String primaLettera = x.substring(0, 1);
        if(x.length() < 2){
            return x;
        }else{
            return rovesciaStringa(x.substring(1)) + primaLettera;
        }

    }

    public static int sommaArray(int[] array, int indice) {
        if(indice == 0){
            return 0;
        }else if(indice == 1){
            return 1;
        }else{
            return sommaArray(array, indice + 1) + sommaArray(array, indice + 2);
        }
    }

    // count down ricorsivo

    public static void countdown(int x) {
        if(x > 0){
            System.out.println(x);
            countdown(x - 1);
        }else{
            System.out.println("Boom!");
        }
    }
    public static void main(String[] args) {
        // countdown(2);
        // System.out.println(fattoriale(4));
        // System.out.println(fibonacci(10));
        // System.out.println(rovesciaStringa("Java"));
        int[] array = {1, 2, 3, 4, 5};
        int indice = array.length;
        System.out.println(sommaArray(array, indice));
    }
}
