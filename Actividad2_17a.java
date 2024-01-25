package unidad2;

import java.util.Scanner;
//numnero aleatorio
public class Actividad2_17a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1=(int)(Math.random()*100+1);
        int num2=(int)(Math.random()*100-1);
        int resultado =num1+num2;
        System.out.println("Indica el resultado de la suma de "+ num1 +
                "+" +num2);
        int resultUser=sc.nextInt();
        if (resultado==resultUser){
            System.out.println("Resultado correcto" );
        }else{
            System.out.println("Respuesta incorrecta. El resultado es->" + resultado);
        }








    }
}
