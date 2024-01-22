package unidad2;

import java.util.Scanner;

public class Actividad2_1 {
    //Diseñar una aplicación que solicite al usuario un número e indique
    //si es par o impar*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        System.out.println("Introduzca un número: ");
        num = sc.nextInt();
        if (num % 2 == 0) {// si el num es par
            System.out.println("Es par");
        } else {//es  impar
            System.out.println("Es impar");


        }
    }
}