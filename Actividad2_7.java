package unidad2;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

//pedir 3 números y mostrarlos ordenados de mayor a menor
public class Actividad2_7 {
    public static void main(String[] args) {
        int n1,n2,n3;
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduzca un número: ");
        n1=sc.nextInt();
        System.out.println("Introduzca otro número: ");
        n2= sc.nextInt();
        System.out.println("Introduzca un tercer número:");
        n3= sc.nextInt();
        if (n1>n2&&n2>n3) {
            System.out.println(n1 + " , " + n2 + " , " + n3);
        }else if (n2>n1&&n1>n3) {
            System.out.println(n2 + " , " + n1 + " , " + n3);
        }else if (n1>n3&&n3>n2) {
            System.out.println(n1 + " , " + n3 + " , " + n2);
        }else if (n2>n3&&n3>n1) {
            System.out.println(n2 + " , " + n3 + " , " + n1);
        }else if (n3>n2&&n2>n1) {
            System.out.println(n3 + " , " + n2 + " , " + n1);
        }else if (n3>n1&&n1>n2) {
            System.out.println(n3 + " , " + n1 + " , " + n2);
        }



    }
}
