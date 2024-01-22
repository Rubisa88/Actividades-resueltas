import java.util.Scanner;

public class Actividad1_14a {
    /*Crea un programa que pida base y altura de un triángulo y muestre su área*/
    public static void main(String[] args) {
        double alt;
        double base;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la base de su triángulo: ");
        base = sc.nextDouble();
        System.out.println("Indique la altura de su triángulo: ");
        alt = sc.nextDouble();
        System.out.println("El área de su triángulo es: " + ((base *alt)/2));


    }






}
