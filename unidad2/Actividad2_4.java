package unidad2;

import java.util.Scanner;

//implementar un programa que pida por teclado un número decimal e
//indique si es un número casi-cero, que son aquellos, positivos o negativos,
//que se acercan a 0 por menos de una unidad.
public class Actividad2_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número decimal positivo o negativo: ");
        double n = sc.nextDouble();
        if (-1<n && n<1 && n!=0){
            System.out.println("Es un número casi cero. ");
        }else{
            System.out.println(" No es un número casi cero. ");
        }

    }


}
