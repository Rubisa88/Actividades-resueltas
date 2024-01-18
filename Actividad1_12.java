package unidad1;

import java.util.Scanner;

public class Actividad1_12 {
    /*Escribir un programa que pida un número al usuario y muestre
    su valor absoluto.
    Para calcular su valor absoluto solo hay que saber si es negativo que se multiplicaría por -1*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba un número (positivo o negativo ) :");
        int n = sc.nextInt();
        int valorAbsoluto = n < 0 ? -1 * n : n;
        System.out.println( "El valor absoluto de " + n + " es " + valorAbsoluto);
    }






}
