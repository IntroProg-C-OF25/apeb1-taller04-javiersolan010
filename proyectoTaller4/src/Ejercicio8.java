import java.util.Scanner;
public class Ejercicio8 {
    public static void main(String[] args) {
    double vtotal, netflix, youtube_p, dropbox, spotify, costo_cuentas, costo_total, edad_u;
    Scanner teclado = new Scanner(System.in);
     System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE NETFLIX: ");
     netflix = teclado.nextDouble();
     System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE YOUTUBE PREMIUM: ");
     youtube_p = teclado.nextDouble();
     System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE DROPBOX: ");
     dropbox = teclado.nextDouble();
     System.out.print("INGRESE EL COSTO MENSUAL DE SU CUENTA DE SPOTIFY: ");
     spotify = teclado.nextDouble();
     System.out.print("INGRESE SU EDAD: ");
     edad_u = teclado.nextDouble();
     costo_cuentas = netflix + youtube_p + dropbox + spotify;
     if (edad_u > 30) {
     costo_cuentas = netflix + youtube_p + dropbox + spotify;  
     costo_total = costo_cuentas;
     System.out.println("EL VALOR TOTAL MENSUAL A PAGAR ES: " + costo_total);
     }
     else {
     costo_cuentas = netflix + youtube_p + dropbox + spotify * (20/100);
     costo_total = costo_cuentas;
     System.out.println("EL VALOR TOTAL MENSUAL A PAGAR ES: " + costo_cuentas);
         }
    }
    
}
