import java.util.Scanner;
import java.util.Stack;

public class principal {
    public static void main(String[] args) {
        metodo m = new metodo();
        Stack<Integer> pilanumero = new Stack<>();
        Scanner sc = new Scanner(System.in);
        int numero = 0;
        int opt = 0;
        boolean bandera = true;
        while (bandera) {
            System.out.println("Escribe un numero: ");
            numero = sc.nextInt();
            pilanumero.push(numero);
            System.out.println("quiere agregar mas numeros? 1:SI 2:NO");
            opt = sc.nextInt();
            if (opt == 2) {
                bandera = false;
            }
        }
        metodo.pilan(pilanumero);
        sc.close();
    }

}
