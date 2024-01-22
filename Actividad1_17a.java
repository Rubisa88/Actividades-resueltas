import java.util.Scanner;

public class Actividad1_17a {
    public static void main(String[] args) {
        /*Solicita al ususario 3 distancias ,una en milimetros, otra en centimetros y otra en metros
         * y crea nun programa para sumar las 3 medidas en centimetros.*/
        double cent;
        double mili;
        double metr;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique cuántos milímetros: ");
        mili= sc.nextDouble();
        System.out.println("Indique cuántos centímetros: ");
        cent= sc.nextDouble();
        System.out.println("Indique cuántos metros: ");
        metr=sc.nextDouble();
        System.out.println("La cantidad total en centímetros es: " + (cent+(mili*0.1)+(metr*100)));







        }
    }






