package Unidad3;

import java.util.Scanner;

public class Actividad3_3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numSecreto=(int)(Math.random()*100+1);//num aleatrorio entre 1 y 100
        System.out.println("Escriba un número entre 1 y 100: ");
        int num = sc.nextInt();
        while (num!=numSecreto&&num!=-1){
            if(numSecreto<num) {
                System.out.println("Menor");
            }else{
                System.out.println("Mayor");
            }

            System.out.println("Introduzca un número");
            num= sc.nextInt();
        }
        if(numSecreto==num){
            System.out.println("Enhorabuena!!!!  Te has ganado un pin...");
        }else{
            System.out.println("Para otra vuelta seguro que atinas...");
        }





    }
}
