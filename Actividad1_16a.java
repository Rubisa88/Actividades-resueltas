package unidad1;

import java.util.Scanner;

/*Diseña un aplicación que solicite al usuario que introduzca una cantidad
de segundos*/
public class Actividad1_16a {
    public static void main(String[] args) {
        int segundos, minutos , horas,seg;
        Scanner sc = new Scanner(System.in);
        System.out.println( "Escriba un numero de segundos: ");
        segundos  = seg= sc.nextInt();

        minutos = segundos / 60;
        segundos%=60;
        horas = minutos / 60;
        minutos%=60;
        System.out.println("El número de segundos "+ seg + " representa " + horas+":"+minutos+":"+segundos );



    }


}
