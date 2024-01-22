package unidad2;

import java.util.Scanner;

public class Actividad2_2propuesta {
    //Solicita por teclado un número de tipo int al usuario y escribe
    //un programa que muestre true o false, dependiendo de si el
    //número es positivo.
    public static void main(String[] args) {
        Scanner entrada=new Scanner(System.in);
        int num;
        System.out.println("Indique un número entero negativo o positivo: ");
        num = entrada.nextByte();
        if (num<0) {
            System.out.println("El número " + num + " es negativo. ");
        }else{
            System.out.println(" El número " + num + " es positivo. ");


        }

    }




}
