package unidad1;

import java.util.Scanner;

//solicitar la longitud en metros y mostrar la parte entera en centimetros
public class Actividad1_22a {
    public static void main(String[] args) {
        double metros,cent;
        int centimetros;
        Scanner sc=new Scanner(System.in);
        System.out.println("Indique la longitus del lanzamiento en metros: ");
        metros=sc.nextDouble();
        cent=metros*100;
        centimetros =(int) cent;
        System.out.println("La longitus del lanzamiento en centímetros es : " + centimetros);





    }
}
