import java.util.Scanner;

public class Actividad1_18a {
    public static void main(String[] args) {
        /*biologo quiere saber cuantas patas hay entre hormigas, arañas y cochinillas*/
        int hor;
        int ara;
        int coch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Número de hormigas: ");
        hor= sc.nextInt();
        System.out.println("Número de arañas: ");
        ara=sc.nextInt();
        System.out.println("Número de cochinillas:");
        coch= sc.nextInt();
        System.out.println("El número total de patas es: "+ ((hor*6)+(ara*8)+(coch*14))+ " patas");
    }
}
