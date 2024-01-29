package Unidad3;

import java.util.Scanner;

public class Actividad3_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int altura;
        int etiqueta=0;
        int etiquetaarbolMasAlto;
        int alturaArbolMasAlto;
        System.out.println("Altura del árbol (" + etiqueta+ ") :");
        altura= sc.nextInt();
        alturaArbolMasAlto=altura;
        etiquetaarbolMasAlto=0;
        while(altura!=-1) {
            if (altura > alturaArbolMasAlto) {
                alturaArbolMasAlto = altura;
                etiquetaarbolMasAlto = etiqueta;
            }
            etiqueta++;
            System.out.println("Altura del árbol (" + etiqueta + ") :");
            altura = sc.nextInt();
        }
        if(alturaArbolMasAlto ==-1){
            System.out.println("No hay ningún árbol");
        }else{
            System.out.println("El árbol más alto mide: " +alturaArbolMasAlto);
            System.out.println("Etiqueta del árbol:" + etiquetaarbolMasAlto);

        }

    }
}
