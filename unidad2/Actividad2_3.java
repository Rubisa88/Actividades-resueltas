package unidad2;

import java.util.Scanner;

//solicitar dos números distintos y mostrar cual es mayor
public class Actividad2_3 {
    public static void main(String[] args) {
        int n1, n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=sc.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=sc.nextInt();
        if (n1>n2) {
            System.out.println(n1 + " es mayor que " + n2);
        }else{
            System.out.println(n2 + " es mayor que " +  n1);
        }
    }


}
