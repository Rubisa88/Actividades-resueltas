package Unidad3;

import java.util.Scanner;

public class Actividad3_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int operador1 ,operador2, resultado;
        int numOperaciones=0;
        do{
            operador1=(int)(Math.random()*100+1);
            operador2=(int)(Math.random()*100+1);
            System.out.println(operador1 + " + " + operador2 + " = ");
            resultado=sc.nextInt();
            numOperaciones++;
        }while (resultado == operador1+operador2);
        System.out.println("Ha conseguido " + (numOperaciones-1) + " sumas consecutivas");


    }
}
