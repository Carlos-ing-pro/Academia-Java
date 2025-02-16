/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pruebasjunit;

/**
 *
 * @author cg873
 */
public class PruebasJunit {

    public String generarSaludo(String nombre){
        
        if (nombre== null || nombre.isEmpty()) {
            return "Nombre vacio";
        }
        
        return "Hola"+nombre;
    }
}
