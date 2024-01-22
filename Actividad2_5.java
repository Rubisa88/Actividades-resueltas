package unidad2;

import java.sql.SQLOutput;
import java.util.Scanner;

//Pedir dos números y mostrarlos de forma decreciente
public class Actividad2_5 {
    public static void main(String[] args) {
        int n1,n2;
        int mayor, menor;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1= sc.nextInt();
        System.out.println("Introduzca otro número: ");
        n2=sc.nextInt();
        mayor= n1>n2? n1:n2;
        menor= n1<n2? n1:n2;
        System.out.println(mayor + "," + menor );
    }




}
