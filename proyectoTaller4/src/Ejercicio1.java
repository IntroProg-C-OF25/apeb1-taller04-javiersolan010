import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        //DECLARACION DE DATOS O VARIABLES
        double base, altura, area;
        Scanner teclado = new Scanner(System.in);
        //INGRESO DE DATOS DE ENTRADA
        System.out.println("DAME LA BASE"); //Carpinteria de Salida 
        base = teclado.nextDouble(); //Datos de entrada 
        System.out.println("DAME LA ALTURA");
        altura = teclado.nextDouble();
        //PROCESAMIENTO DE DATOS DE ENTRADA
        area = (base * altura) / 2;
        //PRESENTACION DE DATOS DE SALIDA 
        System.out.println("Area del triangulo es - " + area);
    }
    
}


