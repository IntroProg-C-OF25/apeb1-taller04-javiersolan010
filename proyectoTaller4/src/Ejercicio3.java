
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner calculadora = new Scanner (System.in);
        int numero, resultado;
        System.out.print("Ingrese un numero entre 2 y 6: ");
        numero = calculadora.nextInt();
    for (int i = 1; i <= 10; i++) {
    resultado = numero * i;
        System.out.println( numero + "x" + i + "=" + resultado);
    }
        
    }
}
