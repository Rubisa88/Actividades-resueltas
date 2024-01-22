import java.util.Scanner;

public class Actividad1_11a {

    /*Un economista te ha encargado un programa para realizar cálculos con el IVA.
    La aplicación debe solicitar la base imponible y el IVA que se debe aplicar.
    Muestra en pantalla el importe correspondiente al IVA y el total*/
    public static void main(String[] args) {
        double n;
        double iva;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la base imponible: ");
        n= sc.nextDouble();
        System.out.println("Indique el IVA: ");
        iva= sc.nextDouble();
        System.out.println("La cantidad correspondiente al IVA es de : " + n * iva /100);
        System.out.println( "El total es de : " + (n + (n * iva /100)));



    }



}
