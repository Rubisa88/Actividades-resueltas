package unidad2;

import java.util.Scanner;

public interface Actividad2_13a {
    public static void main(String[] args) {
        //granja y cálculo de raciones
        Scanner sc=new Scanner(System.in);
        int animales;
        double cantidad,kiloXanimal,racion;
        System.out.println("Indica el número de animales en la granja: ");
        animales= sc.nextInt();
        System.out.println("Indica la cantidad de comida disponible:");
        cantidad= sc.nextDouble();
        System.out.println("Indica cuantos kilos come cada animal:");
        kiloXanimal= sc.nextDouble();
        if (cantidad>=animales*kiloXanimal){
            System.out.println("Hay suficiente comida");
        }else{
            System.out.println("Falta comida en la granja hay que ajustar la ración");
            if (animales!=0){
                racion=cantidad/animales;
                System.out.println("Ajustando a lo que hay, los animales comerán "+ racion + "kg y no tendran los kg iniciales " + kiloXanimal + "kg");

            }
        }



    }





}
