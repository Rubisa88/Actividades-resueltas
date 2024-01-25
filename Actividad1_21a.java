package unidad1;

import java.util.Scanner;

//pide dos numeros y mostrar true si son iguales y false si son distintos
public class Actividad1_21a {
    public static void main(String[] args) {
        int a,b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indica el valor de A: ");
        a= sc.nextInt();
        System.out.println("Indica el valor de B: ");
        b=sc.nextInt();
        boolean si = a==b;
        System.out.println(a+ " y " + b + " son iguales: " + si);







    }
}
