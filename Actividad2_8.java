package unidad2;

import java.util.Locale;
import java.util.Scanner;

//pedir los coeficientes de una ecuacion de segundo grado y mostrar sjus soluciones
public class Actividad2_8 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        sc.useLocale(Locale.US);
        double a,b,c;
        double x1,x2,d;
        System.out.println("Ingrese el valor de a: ");
        a=sc.nextDouble();
        System.out.println("Ingrese el valor de b: ");
        b=sc.nextDouble();
        System.out.println("Ingrese el valor de c: ");
        c= sc.nextDouble();
        d= b*b-4*a*c;
        if (d<0) {
            System.out.println("No existe solución real");
        }else{
            if (a==0) {
                System.out.println("No es una ecuación de segundo grado");
            }else{
                x1= (-b + Math.sqrt(d))/(2*a);
                x2=(+b+Math.sqrt(d)/ (2*a));
                System.out.println("solución 1: "+ x1);
                System.out.println("solucion 2: " +x2);
            }

        }

    }




}
