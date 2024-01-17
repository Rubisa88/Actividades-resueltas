package unidad1;

import java.util.Scanner;

public class Actividad1_6 {


    /* Pediremos dos notas enterasy calcularemos la media.
    Como la media puede tener decimales utilizaremos una variable de
    tipo real. */
    public static void main(String[] args) {
        int nota1, nota2; //variables enteras para las notas
        double media; //la media puede contener decimales
        Scanner sc = new Scanner(System.in); //leemos las notas
        System.out.print("Nota 1: ");
        nota1 = sc.nextInt();
        System.out.print("Nota 2: ");
        nota2 = sc.nextInt();
        //calculamos la media
        media = (nota1 + nota2) / 2.0;
        // en la expresion anterior se divide entre 2.0 para que no sea una
        //división entera
        System.out.println("La media es:" + media);



    }




}
