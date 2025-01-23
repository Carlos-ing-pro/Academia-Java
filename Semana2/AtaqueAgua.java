/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.heroes;

/**
 *
 * @author cg873
 */
public class AtaqueAgua extends Ataques {

    public AtaqueAgua(String ataque1, String ataque2) {
        super(ataque1, ataque2);
    }
    
    @Override
    String ataquePesado(){
        return "Ataque de agua al 200%";
    }
    
}
