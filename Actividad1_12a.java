package unidad1;

import java.util.Scanner;

//Escribir un numero y que sea multiplo de 7
public class Actividad1_12a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num;
        int multiplo;
        System.out.println("Escribe un un número entero: ");
        num= sc.nextInt();
        multiplo=7-num%7;
        System.out.println(multiplo);
        System.out.println("Al número " + num + " hay que sumarle " + multiplo + " para que sea múltiplo de 7.");

    }





}
