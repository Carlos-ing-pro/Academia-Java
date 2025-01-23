/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.heroes;

/**
 *
 * @author cg873
 */
public class Heroes {

    public static void main(String[] args) {
        
        
        System.out.println("El heroe 1 realiza: ");
        
        Ataques a1= new AtaqueEspecial("Golpe meteoro","Eludir");
        
        System.out.println(a1.ataque1);
        System.out.println(a1.ataque2);
        System.out.println(a1.ataquePesado());
        
        System.out.println("***********");
        System.out.println("Heroes 2 realiza: ");
        
        Ataques a2 = new AtaqueAgua("Golpe debil","Defensa");
        
        System.out.println(a2.ataque1);
        System.out.println(a2.ataque2);
        System.out.println(a2.ataquePesado());
        
    }
}
