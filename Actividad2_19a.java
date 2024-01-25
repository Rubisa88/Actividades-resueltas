package unidad2;

import java.util.Scanner;

public interface Actividad2_19a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double grados=0;
        System.out.println("Indica los grados del ángulo:");
        grados= sc.nextDouble();
        grados%=360;
        double radianes=grados*Math.PI/180;
        System.out.print("Los radianes son ");//no hace salto de linea
        System.err.printf("%,4f%n",radianes);




    }
}
