package Unidad3;

import java.util.Scanner;

public class Actividad3_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumaEdades = 0;//suma de todas la edades
        int contadorAlumnos = 0; //contador de alumnos o edades
        int contadorMayorEdad = 0;//contador mayores de 18
        double media; //media de edades
        System.out.println("Introduzca edad: ");
        int edad = sc.nextInt();//leemos edad
        while (edad >= 0) {//repetimos mientras la edad no sea negativa
            sumaEdades += edad;//se acumula edad introducida
            contadorAlumnos++;//incrementamos  edad alumno mas
            if (edad >= 18) {//si la edad es mayor de 18
                contadorMayorEdad++;//añadimos uno mas al grupo de +18
            }
            System.out.println("Introduzca edad: ");
            edad = sc.nextInt();
        }
        media = (double) sumaEdades / contadorAlumnos;
        System.out.println("La suma de todas las edades: " + sumaEdades);
        System.out.println("Media: " + media);
        System.out.println("Número total de alumnos: " + contadorAlumnos);
        System.out.println("Mayores de edad: " + contadorMayorEdad);
    }
}
