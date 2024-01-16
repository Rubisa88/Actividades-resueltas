package unidad1;
/*Escribir una aplicacón que pida el año actual y el de nacimiento del ususario. Debe calcular su edad, suponiendo que en el año en curso el usuario ya ha cumplido años*/
import java.util.Scanner;
public class Actividad1_4 {
    public static void main(String[] args) {
        /* La edad puede calcularse como la diferencia entre el año actual y el de nacimiento. Esto puede contener un error, en el caso de que la fecha actual aún no se haya celebrado el cumpleaños del año en curso.
        * Supondremos que el cumpleaños del usuario ya ha tenido lugar este año*/
int aActual, aNacimiento, edad;
Scanner sc = new Scanner(System.in);
//leemos los datos
        System.out.println("Año de nacimiento: ");
   aNacimiento= sc.nextInt();
        System.out.println(" año actual:" );
aActual = sc.nextInt();
edad=aActual - aNacimiento;//calculamos la edad exacta
        System.out.println("Su edad actual es " + edad + "años" );

    }


}
