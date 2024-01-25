package unidad1;

import java.util.Scanner;

// un parque acuatico necesita una aplicacion para calcular el importe
// por una serie de entradas que introduce el usuario
public class Actividad1_19a {
    public static void main(String[] args) {
        int entradasI,entradasA;
        double calculo, total;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce número de entradas infantiles: ");
        entradasI=sc.nextInt();
        System.out.println("Introduce número de entradas de adulto:");
        entradasA=sc.nextInt();
        calculo=(entradasA*20)+(entradasI*15.50);
        total=calculo>=100? calculo*0.95:calculo;
        System.out.println("El precio del total de entradas es de :" + total);


        }



    }

