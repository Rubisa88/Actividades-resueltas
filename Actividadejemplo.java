package unidad2;

import java.util.Scanner;

public class Actividadejemplo {

//en la discoteca entra si es mayor de edad y si se llama María
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Indica tu edad");
        edad= entrada.nextInt();
        if ( edad >= 18) {
            System.out.println("Eres mayor de edad. ");
        } else{
            System.out.println("Eres menor de edad.");

        }





    }
}
