package unidad1;

import java.util.Locale;
import java.util.Scanner;

/*realizar un programa que pida un num decimal y lo muestre
* redondeando al numero entero más próximo. Para redondear un numero decimal a un
* entero más proximo hay que sumarle 0.5*/
public class Actividad1_14 {
    public static void main(String[] args) {
       double n;
       int  redondeo;
       Scanner sc = new Scanner(System.in);
       sc.useLocale(Locale.US);
       System.out.println("Escriba un  número decimal:");
       n = sc.nextDouble();
       redondeo = (int)  (n + 0.5);
       System.out.println( n + "redondeado es: "+ redondeo);




    }



}
