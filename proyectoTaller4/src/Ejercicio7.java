import java.util.Scanner;
public class Ejercicio7 {
    public static void main(String[] args) {
        double vplanillaluz, costokxh, k_consumidos, edad_u, valor_base, descuento;
        Scanner teclado = new Scanner(System.in);
        System.out.print("INGRESE EL VALOR DEL COSTO DE KILOVATIO POR HORA: ");
        costokxh = teclado.nextDouble();
        System.out.print("INGRESE EL NUMERO DE KILOVATIOS CONSUMIDOS: ");
        k_consumidos = teclado.nextDouble();
        System.out.print("INGRESE LA EDAD DEL USUARIO: ");
        edad_u = teclado.nextDouble();
        valor_base = costokxh * k_consumidos;
        if (edad_u > 65) {
        vplanillaluz = valor_base;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + vplanillaluz);
        }
        else { 
        valor_base =  (costokxh * k_consumidos) * (0.9);  
        vplanillaluz = valor_base;
        System.out.println("EL VALOR A PAGAR DE LA PLANILLA DE LUZ ES: $ " + valor_base);
        }
    }
    
}
