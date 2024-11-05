import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        double monto_prestamo, interes_mensual, plazo_meses, pago_mensualp;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL MONTO DEL PRESTAMO: ");
        monto_prestamo = teclado.nextDouble();
        System.out.print("INGRESE EL VALOR DEL INTERES MENSUAL EN %: ");
        interes_mensual = teclado.nextDouble() / 100;
        System.out.println("INGRESE EL PLAZO DEL PRESTAMO EN MESES: ");
        plazo_meses = teclado.nextDouble();
        pago_mensualp = (monto_prestamo * interes_mensual) / 1 - Math.pow(1 + interes_mensual, -plazo_meses);
        System.out.println("EL PAGO MENSUAL DEL PRESTAMO ES: " + pago_mensualp);
    }
    
}
