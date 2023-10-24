
package p_u4;

import java.util.Scanner;

public class P_U4 {

    public static void main(String[] args) {
        
       Scanner cute = new Scanner(System.in);

        
        double[] numeros = {20.5, 40.6, 78.4, 94.7, 55.3, 22.6, 84.3};

        boolean salir = false;

        while (!salir) {
            System.out.println("Menú:");
            System.out.println("1. Sumar elementos ");
            System.out.println("2. Multiplicar elementos ");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = cute.nextInt();

            switch (opcion) {
                case 1:
                    double suma = 0;
                    for (double numero : numeros) {
                        suma += numero;
                    }
                    System.out.println("La suma de los elementos es: " + suma);
                    break;

                case 2:
                    double multi = 1;
                    for (double numero : numeros) {
                        multi *= numero;
                    }
                    System.out.println("La multiplicacion de los elementos es: " + multi);
                    break;

                case 3:
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, elija otra opcion");
            }
        }

        System.out.println("¡Hasta luego!");
    }
}    
