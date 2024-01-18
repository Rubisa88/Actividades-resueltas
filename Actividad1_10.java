package unidad1;

import java.util.Scanner;

/*Diseñar un algoritmo que nos indique si podemos salir a la calle.
ciertos aspectos influiran en esa decision datos como si esta
lloviendo o si hemos hecho los deberes. salir solo si no esta
lloviendo y si hemos terminado los deberes. existe una excepcion para poder
salir a la biblioteca.
 El algoritmo debe ,mostrar mediante un booleano (true o false) si es posible
 permiso para salir a la calle*/
public class Actividad1_10 {
    public static void main(String[] args) {
        boolean llueve, finTarea , irBiblioteca;
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Está lloviendo? (true/false)");
        llueve = sc.nextBoolean();
        System.out.println("¿Has terminado los deberes?  (true/false9");
        finTarea = sc.nextBoolean();
        System.out.println("¿Tienes que ir a la biblioteca? (tue/false)");
        irBiblioteca = sc.nextBoolean();
        boolean salir = !llueve && finTarea ||irBiblioteca;
        System.out.println("¿Puedes salir?: " + salir);

    }





}
