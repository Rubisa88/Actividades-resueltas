package unidad1;

import java.util.Scanner;

//solicita al usuario un numero real y calcula su raiz cuadrada
public class Actividad1_20a {
    public static void main(String[] args) {
        int num;
        double raiz;
        Scanner sc= new Scanner(System.in);
        System.out.println("Indica un número: ");
        num= sc.nextInt();
        raiz= Math.sqrt(num);
        System.out.println("La raíz cuadrada de " + num + " es " + raiz);







    }
}
