//Escribir un programa que, dado un monto total, lo descomponga en monto a pagar e IGV (18%)

package Actividades_Taller_Programacion;

import java.util.Scanner;

public class Semana1_s2_3 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        // Pedir al usuario que ingrese el monto total
        System.out.print("Ingrese el monto total: ");
        double montoTotal = entrada.nextDouble();

        // Calcular el monto a pagar (sin IGV)
        double montoAPagar = montoTotal / 1.18;

        // Calcular el IGV (18% del monto a pagar)
        double igv = montoAPagar * 0.18;

        // Mostrar resultados
        System.out.println("Monto a pagar (sin IGV): $" + montoAPagar);
        System.out.println("IGV (18%): $" + igv);
        System.out.println("Monto total a pagar: $" + montoTotal);
    }
}
