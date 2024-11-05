import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS DE DATOS O VARIABLES 
        double gasto1, gasto2, gasto3, gastoTotal;
        Scanner teclado = new Scanner(System.in);
        System.out.print("Ingrese el gasto del hijo 1");
        gasto1 = teclado.nextDouble();
        System.out.print("Ingrese el gasto del hijo 2 ");
        gasto2 = teclado.nextDouble();
        System.out.print("Ingrese el gasto del hijo 3");
        gasto3 = teclado.nextDouble();
        gastoTotal = (gasto1 + gasto2 + gasto3);
        System.out.println("GASTO TOTAL DE LOS HIJOS ES: " + gastoTotal);    
   }
    
}
