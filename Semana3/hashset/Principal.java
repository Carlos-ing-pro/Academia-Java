/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haset;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author cg873
 */
public class Principal {
    
    public static void main(String[] args) {
        
        
        Peliculas peli1 = new Peliculas("horror","It");
        Peliculas peli2 = new Peliculas("horror","It2");
        Peliculas peli3 = new Peliculas("C.F","Ted");
        Peliculas peli4 = new Peliculas("Drama","Codigo Davinci");
        Peliculas peli5 = new Peliculas("Animada","Toy Story");
        Peliculas peli6 = new Peliculas("horror","It");
        
        System.out.println(peli6.equals(peli1));
        
        List <Peliculas> pelicula = List.of(peli1,peli2,peli3,peli4,peli5,peli6);
        
        Set<Peliculas> setPelis = new HashSet<>(pelicula);
        
        setPelis.remove(new Peliculas("horror","it"));
        
        setPelis.forEach(a-> System.out.println(a));
    }
    
}
