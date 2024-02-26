package co.edu.sena;

import java.util.Scanner;

/**
 * area de un cuadrado!
 *
 */
public class App 
{
    /**
     * @param args
     */
    public static void main( String[] args )
   {
       {
         System.out.println( "ingresar un lado de un cuadrado para saber su area y perimetro" );
         System.out.println( "Ingrese el valor de el lado");
 
         Scanner src = new Scanner(System.in);
         double base = src.nextDouble();

         double mult =4;

         double result = (base+base);
         System.out.println("su area es de :" +result);

         double result1 = (base*mult);
         System.out.println(" su perimetro es de :" +result1*2);
        }
    }
}