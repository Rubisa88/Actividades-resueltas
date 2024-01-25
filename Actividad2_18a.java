package unidad2;

import java.util.Scanner;

public class Actividad2_18a {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int num1=(int)(Math.random()*100+1);
        int num2=(int)(Math.random()*100+1);
        int operacion=(int)(Math.random()*3+1);
        int resultado=0;
        char simbolo=' ';
        switch (operacion) {
            case 1 -> {
                simbolo = '+';
                resultado = num1 + num2;
            }
            case 2 -> {

                simbolo = '-';
                resultado = num1 - num2;
            }
            case 3 -> {
                simbolo = 'x';
                resultado = num1 * num2;
            }
        }
            System.out.println("¿Cuánto es " + num1 +" "+simbolo+" "+ num2 +" ?");
            int resultUser=sn.nextInt();
            if (resultado==resultUser) {
                System.out.println("Operación correcta");
            }else{
                System.out.println("Las matemáticas no son lo tuyo...");

            }

    }



}
