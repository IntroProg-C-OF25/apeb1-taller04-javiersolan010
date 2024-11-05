import java.util.Scanner;
public class Ejercicio9 {
    public static void main(String[] args) {
    double ladocuadrado, alturatriangulo, areacuadrado, areatriangulo, arearectangulo, areatotal;
    Scanner teclado = new Scanner(System.in);
    System.out.print("INGRESE EL VALOR DEL LADO DEL CUADRADO: ");
    ladocuadrado = teclado.nextDouble();
    System.out.print("INGRESE EL VALOR DE LA ALTURA DEL TRIANGULO: ");
    alturatriangulo = teclado.nextDouble();
    areacuadrado = ladocuadrado * ladocuadrado;
    areatriangulo = (3 * ladocuadrado * alturatriangulo) / 2;
     arearectangulo = ladocuadrado * alturatriangulo;
     areatotal = areacuadrado + areatriangulo + arearectangulo;
     System.out.println("EL AREA TOTAL DEL POLIGONO ES: " + areatotal);    
    }
    
}
