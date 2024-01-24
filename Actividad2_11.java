package unidad2;

import java.util.Scanner;

//solicita un numero entre 1 y 7 correspondiente a un dia de la semana
public class Actividad2_11 {
    public static void main(String[] args) {
        int dia;
        Scanner sc=new Scanner(System.in);
        System.out.println("********************************");
        System.out.println("*****       SEMANA         *****");
        System.out.println("*****       1.Lunes        *****");
        System.out.println("*****       2.Martes       *****");
        System.out.println("*****       3.Miércoles    *****");
        System.out.println("*****       4.Jueves       *****");
        System.out.println("*****       5.Viernes      *****");
        System.out.println("*****       6.Sábado       *****");
        System.out.println("*****       7.Domingo      *****");
        System.out.println("********************************");
        System.out.println("Introduzca un número del 1 al 7: ");
        dia= sc.nextInt();
        switch (dia){
            case 1-> System.out.println("El día elegido es lunes. ");
            case 2-> System.out.println("El día elegido es martes.");
            case 3-> System.out.println("El día elegido es miércoles");
            case 4-> System.out.println("El día elegido es jueves");
            case 5-> System.out.println("El día elegido es viernes");
            case 6-> System.out.println("El día elegido es sábado");
            case 7-> System.out.println("El día elegido es domingo");

        }
    }





}
