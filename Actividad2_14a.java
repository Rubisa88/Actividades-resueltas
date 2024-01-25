package unidad2;

import java.util.Scanner;

//solicitar un numero entre 1 y 99
public record Actividad2_14a() {
    public static void main(String[] args) {
        //declaracion de las variables
        Scanner sn = new Scanner(System.in);
        byte num;
        System.out.print("Inserte un número entre 1 y 99 -> ");
        num = sn.nextByte();
        String salida = "";
        switch (num) {
            case 11 -> salida = "Once";
            case 12 -> salida = "Doce";
            case 13 -> salida = "Trece";
            case 14 -> salida = "Catorce";
            case 15 -> salida = "Quince";
            case 16 -> salida = "Dieciséis";
            case 17 -> salida = "Diecisiete";
            case 18 -> salida = "Dieciocho";
            case 19 -> salida = "Diecinueve";
            case 21 -> salida = "Veintiuno";
            case 22 -> salida = "Veintidós";
            case 23 -> salida = "Veintitrés";
            case 24 -> salida = "Veinticuatro";
            case 25 -> salida = "Veinticinco";
            case 26 -> salida = "Veintiseis";
            case 27 -> salida = "Veintisiete";
            case 28 -> salida = "Veintiocho";
            case 29 -> salida = "Veintinueve";
            default -> {
                byte u = (byte) (num % 10);
                int d = num / 10;
                switch (d) {
                    case 1 -> salida = "Diez";
                    case 2 -> salida = "Veinte";
                    case 3 -> salida = "Treinta ";
                    case 4 -> salida = "Cuarenta ";
                    case 5 -> salida = "Cincuenta ";
                    case 6 -> salida = "Sesenta ";
                    case 7 -> salida = "Setenta ";
                    case 8 -> salida = "Ochenta ";
                    case 9 -> salida = "Noventa ";
                }
                if (d >= 3 && u != 0) {
                    salida += " y ";
                }
                switch (u){
                    case 1-> salida += " uno ";
                    case 2-> salida += " dos ";
                    case 3-> salida += " tres ";
                    case 4-> salida += " cuatro ";
                    case 5-> salida += " cinco ";
                    case 6-> salida += " seis ";
                    case 7-> salida += " siete ";
                    case 8-> salida += " ocho ";
                    case 9-> salida += " nueve ";
                }
            }


        }
        System.out.println("Tu número escrito es: " + salida );
    }
}
