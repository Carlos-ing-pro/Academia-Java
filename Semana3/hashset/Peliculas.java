/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.haset;

import java.util.Objects;

/**
 *
 * @author cg873
 */
public class Peliculas {
    
    private String categoria;
    private String nombre;

    public Peliculas(String categoria, String nombre) {
        this.categoria = categoria;
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        
        return 100;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Peliculas other = (Peliculas) obj;
        if (!Objects.equals(this.categoria, other.categoria)) {
            return false;
        }
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Peliculas{" + "categoria=" + categoria + ", nombre=" + nombre + '}';
    }
    
    
    
}
