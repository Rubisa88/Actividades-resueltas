package unidad2;

import java.util.Scanner;

//pedir una nota entera de 0 a 10 y mostrarla de la siguiente forma:
// de 0 a 4 insuficiente suficiente 5 6 bien 7 y 8 notabkle y 9 y 10 sobresaliente
public class Actividad2_10 {
    public static void main(String[] args) {
        int nota;
        Scanner sn= new Scanner(System.in);
        System.out.println("Escriba su nota: ");
        nota= sn.nextInt();
        if (0<=nota&&nota<=4){
            System.out.println("Insuficiente.");
        }else if (nota==5){
            System.out.println("Suficiente.");
        } else if (nota==6) {
            System.out.println("Bien.");
        }else if (nota==7||nota==8){
            System.out.println("Notable.");
        } else if (nota==9||nota==10) {
            System.out.println("Sobresaliente.");
        }else {
            System.out.println("Nota no válida.");
        }
    }
}
