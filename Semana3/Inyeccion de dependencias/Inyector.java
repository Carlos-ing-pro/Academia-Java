/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inyeccion;

/**
 *
 * @author cg873
 */
public abstract class Inyector {
    
    public static Scripthack getScripthack(){
        
        ScripthackService sc = new EmailScripthackService();
        
        return new Scripthack(sc);
    }
    
}
