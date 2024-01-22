package unidad2;

import java.util.Scanner;

//pedir dos números enteros y decir si son iguales o no
public class Actividad2_2 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número entero: ");
        n1= sc.nextInt();
        System.out.println("Introduzca otro número entero: ");
        n2= sc.nextInt();
        if (n1==n2) {
            System.out.println("Los números " + n1 + " y " + n2 + " son iguales.");
        }else{
            System.out.println("Los números " + n1 + " y " + n2 + " son distintos.");
        }
    }



}
