package unidad2;

import java.util.Scanner;

//Realizar la actividad 2_3 consideranco que los dos numeros sean iguales
public class Actividad2_6 {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1= sc.nextInt();
        System.out.println("Introduzca de nuevo un número: ");
        n2=sc.nextInt();
        if (n1 == n2) {
            System.out.println(n1 + " es igual a " + n2);
        }else{
            System.out.println( n1 + " es distinto de " + n2);
        }




    }
}
