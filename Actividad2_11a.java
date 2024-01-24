package unidad2;

import java.util.Scanner;

public class Actividad2_11a {
    public static void main(String[] args) {
        boolean capicua=false;
        Scanner sc=new Scanner(System.in);
        int num,u,d,c,um;
        System.out.println("-----CAPICÚA-----");
        System.out.println("Indica un número entreo entre 0 y 9999:");
        num= sc.nextInt();u=num%10;
        u=num%10;
        num/=10;
        d=num%10;
        num/=10;
        c=num%10;
        num/=10;
        um=num;
        if (um==u&&d==c){
            capicua=true;
        }else if(um==0&&c==u){
            capicua=true;
        }else if (um==0&&c==0&&d==u){
            capicua=true;
        }else if (um==0&&c==0&&d==0){
            capicua=true;
        }
        if (capicua) {
            System.out.println("Tu número es capicúa");
        }else{
            System.out.println("Tu número no es capicúa");
        }







    }
}
