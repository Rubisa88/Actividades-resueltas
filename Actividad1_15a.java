import java.util.Scanner;

public class Actividad1_15a {
    /*Crea un programa que calcule el valor de y en un ppolinomio pidiciendo a, b y c*/

    public static void main(String[] args) {
        double a;
        double b;
        double c;
        double x;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca eñl valor de a: ");
        a= sc.nextDouble();
        System.out.println("Introduca el valor de b: ");
        b= sc.nextDouble();
        System.out.println("Introduzca el valor de c: ");
        c= sc.nextDouble();
        System.out.println("Introduzca el valor de x: ");
        x= sc.nextDouble();
        System.out.println("El valor correspondiente a y es :" + (a*(Math.pow(x,2)) + (b*x) +c ));


    }



}
