package unidad2;

import java.util.Scanner;

//Escribe una aplicación que pida al ususario dos números enteros
//y muestre true si ambos son distintos o alguno de ellos es 0
//A!=B || A==0 | B==0
public class Actividad2_3propuesta {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.println("Indique el valor de a: ");
        a= sc.nextInt();
        System.out.println("Indique el valor de b:");
        b= sc.nextInt();
        if (a!=b || a==0 ||b==0) {
            System.out.println("Cumple la condición");
        }else{
            System.out.println("No cumple la condición");
        }


    }



}
