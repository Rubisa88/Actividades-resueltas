package unidad2;

import java.util.Scanner;

public class Condicional2 {
    public static void main(String[] args) {
        int opcion, valor1 = 0, valor2 = 0;
        double resultado = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("***********************************");
        System.out.println("*******MENÚ DE LA CALCULADORA******");
        System.out.println("** 1.Sumar                     ****");
        System.out.println("** 2.Restar                    ****");
        System.out.println("** 3.Multiplicar               ****");
        System.out.println("** 4.Dividir                   ****");
        System.out.println("** 5.Salir                     ****");
        System.out.println("***********************************");
        System.out.println("Indica tu opción->");
        opcion = sc.nextInt();
        if (opcion>1 && opcion<4) {
            System.out.println("Indica el valor  1->");
            valor1 = sc.nextInt();
            System.out.println("Indica el valor  2->");
            valor2 = sc.nextInt();
        }
        switch (opcion) {
            case 1: {resultado = valor1 + valor2;
                break;
            }
            case 2: {resultado = valor1 - valor2;
                break;
            }
            case 3: {resultado = valor1 * valor2;
                break;
            }
            case 4: {resultado = valor1 / valor2;
                break;
            }
            case 5: {
                System.out.println("Hasta prontooo :)");
                break;
            }
            default: {
                System.out.println("La selección del menú no es la correcta, por favor elija una opción del 1 al 5.");
            }

        }
        System.out.println("El resultado  de la selección es: " + resultado);


    }
}
