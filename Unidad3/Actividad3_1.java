package Unidad3;

import java.util.Scanner;

/*Diseñar un programa que muestre por cada numero introducido si es par si es positivo y su cuadrado
* el proceso se repetira hasta que el numero sea cero*/
public class Actividad3_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean esPar,esPositivo;
        System.out.println("Indica un número: ");
        int num= sc.nextInt();
        while(num!=0) {
            esPar=num%2==0? true:false ;
            esPositivo=num>=0?true:false;
            System.out.println("¿Es par?"+ esPar );
            System.out.println("¿Es positivo? " + esPositivo );
            System.out.println("Cuadrado: " + num*num );
            System.out.println("Introduzca otro número: ");
            num= sc.nextInt();
        }









    }
}
