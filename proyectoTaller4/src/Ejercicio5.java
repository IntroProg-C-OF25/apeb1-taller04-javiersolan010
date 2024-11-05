import java.util.Scanner;
public class Ejercicio5 {
    public static void main(String[] args) {
        double cpu, keyboard, pantalla, raton, costo_total;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL COSTO DEL CPU:");
        cpu = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DEL KEYBOARD:");
        keyboard = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DE LA PANTALLA:");
        pantalla = teclado.nextDouble();
        System.out.print("INGRESE EL COSTO DEL RATON:");
        raton = teclado.nextDouble();
        costo_total = cpu + keyboard + pantalla + raton;
        System.out.println("EL COSTO TOTAL DE LA COMPUTADORA ES: " + costo_total);
  
    }
    
}
