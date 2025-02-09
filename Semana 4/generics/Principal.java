/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.generics;

/**
 *
 * @author cg873
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
        Contenedor<Perro> p1 = new Contenedor<>(new Perro("Firulais"));
        Contenedor<Gato> p2 = new Contenedor<>(new Gato("Chispitas"));

        Perro mascota1 = p1.getT();
    }
}
