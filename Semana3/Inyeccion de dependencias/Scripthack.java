/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inyeccion;

/**
 *
 * @author cg873
 */
public class Scripthack {
    
    private final ScripthackService hack;

    public Scripthack(ScripthackService hack) {
        this.hack = hack;
    }
    
    public void hackeando(String hackeo){
        System.out.println("prueba de inyeccion");
        hack.sendhack("Hackeando la Pc");
    }
}
