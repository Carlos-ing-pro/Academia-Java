/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.exceptions;

import java.util.Scanner;

/**
 *
 * @author cg873
 */
public class Exceptions {

    public static void main(String[] args) {
        
        Scanner z = new Scanner(System.in);
        
        int n;
        
        System.out.println("Ingrese el numero de acuerdo a que pais pertence: "
                + "\n1-España\n2-Mexico \n3-Suezia \n4-Canada");
        n=z.nextInt();
       
        
        
    }
    
    private int SeleccionPais(int n) throws PaisIncorrecto{
        if (n>4) 
            throw new PaisIncorrecto("El numero que selecciono no esta en las opciones.");
        
        
        
        return n;
    }
   
}
    


