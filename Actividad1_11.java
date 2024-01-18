package unidad1;

import java.util.Scanner;
/* Un frutero necesita calcular los beneficios anuales que obtiene
* de la venta de  manzanas y peras.
* Diseñar una aplicacion para pedirle las ventas en kilos de cada
* semestre por cada fruta
* la aplicacion mostrará el importe total sabiendo que kgmanzana 2.35
* kgpera1.95*/
public class Actividad1_11 {

    public static void main(String[] args) {
        final double FINAL_MANZANAS = 2.35;
        final double FINAL_PERAS =1.95;
        int vmanzanas1s, vmanzanas2s, vperas1s,vperas2s;
        double impTotal;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ventas de manzanas en kg en el primer semestre : ");
        vmanzanas1s = sc.nextInt();
        System.out.println("Venta de manzanas en  kg en el segundo semestre: ");
        vmanzanas2s = sc.nextInt();
        System.out.println("Venta de peras en kg en el primer semestre");
        vperas1s = sc.nextInt();
        System.out.println("Venta de peras en kg en el segundo semestre");
        vperas2s = sc.nextInt();
        impTotal = (vmanzanas1s +vmanzanas2s) * FINAL_MANZANAS;
        impTotal += (vperas1s + vperas2s) * FINAL_PERAS;
        System.out.println("El importe total de beneficios es : "+ impTotal + "euros");







    }

}
