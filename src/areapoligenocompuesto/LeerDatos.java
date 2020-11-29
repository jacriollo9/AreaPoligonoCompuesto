/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package areapoligenocompuesto;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class LeerDatos {
    
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner (System.in);
        // Declarar y inicializar las variables
        int miEntero = 0;
        double miDecimal = 0;
        String miCadena = "";
        
        //Lectura de datos
        System.out.println("Ingrese un número entero");
        miEntero = Leer.nextInt();
        
        System.out.println("Ingrese un número decimal");
        miDecimal = Leer.nextDouble();
        
        System.out.println("Ingrese una cadena de texto");
        miCadena = Leer.next();
        
        //Salida de datos
        System.out.println("Mi entero es: " +miEntero);
        System.out.println("Mi decimal es: " +miDecimal);
        System.out.println("Mi cadena es: " +miCadena);
    }
}
