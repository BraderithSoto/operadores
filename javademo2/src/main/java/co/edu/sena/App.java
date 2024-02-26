package co.edu.sena;

import java.util.Scanner;

/**
 * suma!
 *
 */
public class App 
{
    public static void main( String[] args )
   {
        System.out.println( "ingresar dos numeros por el teclado y sumarlos" );
        System.out.println( "Ingrese el primer numero");
 
        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

        System.out.println( "Ingrese el segundo numero");

        double height = src.nextDouble();

        //Proceso
         double result = (base+height);

         //Salida
        System.out.println("la suma de los dos numeros es :" +result);
    }
}