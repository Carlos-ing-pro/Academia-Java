/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inyeccion;

/**
 *
 * @author cg873
 */
public class EmailScripthackService implements ScripthackService{

    @Override
    public void sendhack(String hackeo) {
        System.out.println("Hackeando por medio de un email.");  
    }
    
}
