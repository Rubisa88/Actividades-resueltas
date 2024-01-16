package unidad1;
/* Pedir al usuario su edad y mostrar la que tendrá el próximo año*/
import java.util.Scanner;

public class Actividad1_3 {
    public static void main(String[] args) {
/*En el ejercicio realizamos las tres fases típicas de cualquier aplicación:
* 1. entrada de datos. pedimos la edad
* 2. Procesado: en este caso incrementar la edad en 1
* 3. salida de datos :mostrar los resultados*/
        int edad; //aqui guardamos la edad del usuario
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba su edad: ");
        edad = sc.nextInt();
        edad = edad + 1;
        /*la línea anterior puede sustituirse por : edad++;
        ahora mostraremos el valor de la variable edad
         */
        System.out.println("El próximo año su edad será " +  edad + " años ");






    }




}
