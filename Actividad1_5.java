public class Actividad1_5 {
    /*Veremos como Java evita que una operación provoque un desbordamiento.*/

    public static void main(String[] args) {
        short num;
        num = 32767; //Valor máximo dentro del rango short
        System.out.println("Valor máximo para el tipo short: " + num );
        num+=4; //incrementamos en 1. Paara evitar salirse del rango, la variable num
        //tomará el valor mínimo para el tipo short

        System.out.println("Ahora el número es " + num);







    }






}