import java.util.Scanner;

/**
 * Created by black on 16/11/2017.
 */
public class Alpacas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // primera solución
        int a = 1;
        int b = 1;
        int c = 1;
        int d = 1;
        int siguiente;
        int e = 0;

        Scanner entradaEscaner = new Scanner(System.in);
        System.out.println("Ingrese N: ");
        int n = Integer.parseInt(entradaEscaner.nextLine());
        System.out.println("Ingrese M: ");
        int m = Integer.parseInt(entradaEscaner.nextLine());

        for (int i = 1; i < n; i++) {
            siguiente = (a + b + c) % m;
            e = a;
            c = d;
            d = siguiente;
            a = b;
            b = siguiente;
        }
        System.out.println(e);
    }
}
