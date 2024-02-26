package co.edu.sena;

import java.util.Scanner;

/**
 * conversor!
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
            System.out.println( "conversor de euros a dolares" );
            System.out.println( "Ingrese su cantidad de euros");
     
            Scanner src = new Scanner(System.in);
            double base = src.nextDouble();
            
            
            double height=1.08;


            double result = (base*height);
    
             //Salida
            System.out.println("la conversion total es :" +result);
        }   
    }
}