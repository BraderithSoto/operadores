package co.edu.sena;

import java.util.Scanner;

/**
 * longitud y area!
 *
 */
public class App 
{
    public static void main( String[] args )
   {
       {
         Scanner scanner = new Scanner(System.in);
         System.out.print("ingrese radio de circunferencia:");
         double radio = scanner.nextDouble();
         double longitud = 2 * Math.PI * radio;
         double circuloareavista = Math.PI * Math.pow(radio, 2);
         System.out.println("la longitud:" + longitud);
         System.out.println("el area vista:" + circuloareavista);
         scanner.close();
        }
    }
}