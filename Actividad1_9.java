package unidad1;
import java.util.Scanner;
/*Escrubir un programa que pida un numero al usuario e indique
* mediante un literal boelando(true o false) si el numero es par*/
public class Actividad1_9 {
    public static void main(String[] args) {
        int numero;
        System.out.println("Escriba un número:");
        numero = new Scanner(System.in).nextInt();
        boolean esPar = ( numero / 2) == 0;
        System.out.println("Es par: " + esPar);

    }



}
