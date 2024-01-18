package unidad1;
import java.util.Scanner;
/*Para calcular la longitud y el área utilizaremos el valor de pi que nos
    brinda Match.Y usaremos el método de la API que eleva una base a un
    exponente para el cuadrado*/
public class Actividad1_7 {
    public static void main(String[] args) {
        double radio; //el radio puede ser decimales
        double area, longitud;
        Scanner sc = new Scanner(System.in);
        //pedimos los datos
        System.out.print("Escriba el radio :");
        radio = sc.nextDouble();
        longitud = 2 * Math.PI * radio;
        area = Math.PI * radio;
        System.out.println("La longitud de la circunferencia es:  " + longitud);
        System.out.println("El área de la circunferencia es: " + area);
    }









}
