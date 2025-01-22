/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calificaciones;

import java.util.Scanner;

/**
 *
 * @author cg873
 */
public class Calificaciones {
    
    Scanner z = new Scanner(System.in);
    
    public void Alumnos(int alum){
        
        double cal1=0;
        double cal=0;
        double res=0;
        
       
        for (int i = 0; i < alum; i++) {
            System.out.println("Ingrese la calificacion del alumno: "+(i+1));
            cal=z.nextDouble();
            res+=cal;
            
        }
        double promedio=res/alum;
        System.out.println("promedio="+promedio);
        
    }
    

    public static void main(String[] args) {
        
        int alum;
        
        
        Calificaciones a1 = new Calificaciones();
         
        a1.Alumnos(3);
        
    }
}
