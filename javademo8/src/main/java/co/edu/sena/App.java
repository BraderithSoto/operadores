package co.edu.sena;

import java.util.Scanner;

/**
 * promedio!
 *
 */
public class App 
{
    public static void main( String[] args )
   {
       {
         System.out.println( "ingresaar tres numeros para calcular su promedio" );
         System.out.println( "Ingrese el primer numero");
 
         double div= 3;

         Scanner src = new Scanner(System.in);
         double num1 = src.nextDouble();

         System.out.println( "Ingrese el segundo numero");
         double num2 = src.nextDouble();

         System.out.println( "Ingrese el tercer numero");
         double num3 = src.nextDouble();

         double result = (num1+num2+num3);

         System.out.println("Su suma es :" +result);
         
         double result1 = (result/div);

         System.out.println("El promedio entre sus numeros es :" +result1);
        }
    }
}