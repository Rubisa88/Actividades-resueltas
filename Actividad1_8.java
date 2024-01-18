package unidad1;
import java.util.Scanner;
/*realizar una aplicacion que solicite al usuario su edad y le indique
si es mayor de edad (mediante un literal boleano: true o false)*/

public class Actividad1_8 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba su edad:");
        int edad =sc.nextInt();
        boolean mayorEdad = edad >= 18;
        System.out.println("Mayoría de edad:" + mayorEdad) ;



    }




}
