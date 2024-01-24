package unidad2;

import java.util.Scanner;

//escribir una aplicación que indique cúantas cifras tiene un
//número enteri introducido por tecflado, que estará comprendido
//entre 0 y 99999
public class Actividad2_9 {
    public static void main(String[] args) {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Escriba un número entero entre 0 y 9999->" );
        num= sc.nextInt();
        if (num<10) {
            System.out.println("Tiene una cifra.");
        }else if (num<100){
            System.out.println("Tiene dos cifras.");
        }else if (num<1000){
            System.out.println("Tiene tres cifras.");
        } else if (num<10000) {
            System.out.println("Tiene 4 cifras.");
        }else if (num<100000) {
            System.out.println("Tiene 5 cifras.");
        }


    }
}
