import java.util.Stack;

public class metodo {
    public static void pilan(Stack<Integer> pila) {
        int numeros = 0;
        int numerosP = 0;
        int sumanumeros = 0;

        while (!pila.isEmpty()) {
            int numero = pila.pop();
            if (numero < 0) {
                System.out.println("lis numero negativos fueron: " + numero);
                System.out.println("su cubo es: " + (numero * numero * numero));
            }

            if (numero >= 20 && numero <= 80) {
                numeros = numeros++;
            }

            if (numero > 0) {
                numerosP = numerosP++;
            }

            if (numero >= 80 && numero <= 200) {
                sumanumeros = sumanumeros + numero;
            }
        }
        System.out.println("Cantidad de números entre 20 y 80: " + numeros);
        System.out.println("Cantidad de números positivos: " + numerosP);
        System.out.println("Suma de números entre 80 y 200: " + sumanumeros);
    }
}
