package unidad2;


import java.util.Scanner;

//calcular el dinero recaudado en un concierto
//datos a solicitar: el afoto el precio y el numero de vendidas
//si el numero de vendidas es menor al 20% no hay concierto
//si no supera el 50% se rebaja ñla entrada un 25%
public class Actividad2_5propuesta {
    public static void main(String[] args) {
        Scanner sn=new Scanner(System.in);
        int aforo, entVend;
        double precio, recaudacion;
        System.out.println("Indique el precio de la entrada: ");
        precio = sn.nextDouble();
        System.out.println("Indique el aforo del local: ");
        aforo= sn.nextInt();
        System.out.println("Número de entradas vendidas: ");
        entVend= sn.nextInt();
        recaudacion= precio*entVend;
        if (entVend<aforo*0.2) {
            System.out.println("Concierto cancelado. ");
        }
        else if (entVend<aforo*0.5) {
            precio = precio - (precio * 0.25);
            recaudacion = precio * aforo;
            System.out.println("Sus entradas están rebajadas al 25%.");
        }else {
            System.out.println("El concierto se celebrará a las 23.00 horas.");
        }

        System.out.println("La recaudación del concierto es de: " + recaudacion + "€.");



        }








    }



