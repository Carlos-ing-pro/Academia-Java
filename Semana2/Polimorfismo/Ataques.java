/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heroes;

/**
 *
 * @author cg873
 */
public abstract class Ataques {
    
    String ataque1="Golpe fuerte";
    String ataque2="Defensa";

    public Ataques(String ataque1, String ataque2) {
        this.ataque1=ataque1;
        this.ataque2=ataque2;
    }
    
    
   abstract String ataquePesado();
    
    
}
