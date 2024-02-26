package co.edu.sena;

import java.util.Scanner;

/**
 * elevar al cuadrado!
 *
 */
public class App 
{
    public static void main( String[] args )
   {
        System.out.println( "ingresa un numero para elevarlo al cuadrado" );
        System.out.println( "Ingrese el numero");
 
        Scanner src = new Scanner(System.in);
        double base = src.nextDouble();

         double result = (base*base);

        System.out.println("El resultado de su numero elevado al cuadrado es :" +result);
    }
}