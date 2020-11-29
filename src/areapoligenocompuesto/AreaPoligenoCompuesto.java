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
public class AreaPoligenoCompuesto {
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner Leer = new Scanner(System.in);
            
        // TODO code application logic here
        
        // Declaración y inicilización de variables
        double lc, at, ar, A, B, D, ats, area;
        
        lc = 0; at= 0; ar= 0; A= 0; B= 0; D= 0; ats= 0; area= 0;
        
        
        System.out.println("Programa que permite el calculo del poligono compuesto");
        
        System.out.println("");
        
        //Lectura de Datos
        
        System.out.println("Ingrese el lado del cuadrado");
        lc = Leer.nextDouble();
        
        System.out.println("Ingrese la altura del triangulo");
        at = Leer.nextDouble();
        
        System.out.println("Ingrese la altura del rectangulo");
        ar = Leer.nextDouble();
        
        //Proceso
        A = Math.pow(lc, 2);
        B = (lc * at) / 2;
        ats = B * 3;
        D = lc * ar;
        area = A + ats +D; 
        
        //Salida de datos
        System.out.println("El area del poligono compuesto es:" +area+
        ",compuesto por un cuadrado de lado" +lc+
        ", un rectangulo de altura" +ar+
        " y una altura de triangulo " +at);
    }
    
}
