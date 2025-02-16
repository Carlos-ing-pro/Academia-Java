/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.pruebasjunit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author cg873
 */
public class PruebasJunitIT {
    
    @Test
    public void testGenerarSaludo() {
        
        PruebasJunit p1 = new PruebasJunit();
        String resultado = p1.generarSaludo("");
        assertEquals("Hola Carlos",resultado);
    }
    
    @Test
    public void testGenerarSaludoVacio() {
        
        PruebasJunit p1 = new PruebasJunit();
        String resultado = p1.generarSaludo("Carlos");
        assertEquals("Hola Carlos",resultado);
    }
    
    @Test
    public void testGenerarSaludoNulo() {
        PruebasJunit p1 = new PruebasJunit();
        String resultado = p1.generarSaludo(null);
        assertEquals("Nombre vacio o nulo",resultado);
    }
    
}
