/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heroes;

/**
 *
 * @author cg873
 */
public  class AtaqueEspecial extends Ataques {
    
    public AtaqueEspecial(String ataque1, String ataque2) {
        super(ataque1, ataque2);
    }
    
    @Override
    String ataquePesado(){
        return "Ataque pesado especial 1";
    }
    
    
}
