package unidad1;
/* Un programa para solicitar notas del primer, segundo y tercer trimestre. El programa mostrará
* nota media del curso. Boletin de calificaciones en numero entero y expediente en decimales */

import java.util.Scanner;

public class Actividad1_13 {
    public static void main(String[] args) {
        int nota1, nota2 , nota3;
        int boletin;
        double expediente;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nota del primer trimeste: ");
        nota1 = sc.nextInt();
        System.out.println("Nota del segundo trimestre: ");
        nota2 = sc.nextInt();
        System.out.println("Nota del  tercer trimestre:");
        nota3 = sc.nextInt();
        expediente = (nota1 + nota2 +nota3) / 3.0;
        boletin =  (int) expediente;
        System.out.println("La nota media del expediente es: " + expediente);
        System.out.println("La nota media del boletín es : " + boletin);

    }





}
