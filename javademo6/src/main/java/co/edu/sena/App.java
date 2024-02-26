package co.edu.sena;

import java.util.Scanner;

/**
 * area y volumen!
 *
 */
public class App 
{
    public static void main( String[] args )
   {
     {
        System.out.println("Escribir un algoritmo que determine el área y volumen de un cilindro");
        
        Scanner src = new Scanner(System.in);

        System.out.println("Ingrese la base del cilindro: ");
        double radio = src.nextDouble();

        System.out.println("Ingrese la altura del cilindro: ");
        double altura = src.nextDouble();

        // Calcular el área de la superficie lateral
        double areaLateral = 2 * Math.PI * radio * altura;

        // Calcular el área total
        double areaTotal = 2 * Math.PI * radio * (radio + altura);

        // Calcular el volumen
        double volumen = Math.PI * Math.pow(radio, 2) * altura;

        // Imprimir los resultados
        System.out.println("El área de la superficie lateral es: " + areaLateral);
        System.out.println("El área total es: " + areaTotal);
        System.out.println("El volumen es: " + volumen);
      }
    }

}