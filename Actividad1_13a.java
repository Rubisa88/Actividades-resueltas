package unidad1;
//como la acrtividad 12 pero con dos numeros

import java.util.Scanner;

public class Actividad1_13a {
    public static void main(String[] args) {
        int num, num2, multiplo;
        Scanner sc=new Scanner(System.in);
        System.out.print("Ingrese un número:");
        num= sc.nextInt();
        System.out.println("Ingrese otro número: ");
        num2= sc.nextInt();
        multiplo= num2-num%num2;
        System.out.println("Al número " + num +  " hay que sumarle "+ multiplo + " para que sea multiplo de "+ num2 );



    }

}
