/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hasa;

import java.util.Objects;

/**
 *
 * @author cg873
 */
public class Cuentas {
    private StringBuilder nombre;
    private int numid;

    public Cuentas(StringBuilder nombre, int numid) {
        super();
        this.nombre = nombre;
        this.numid = numid;
    }

    public StringBuilder getNombre() {
        return nombre;
    }

    public void setNombre(StringBuilder nombre) {
        this.nombre = nombre;
    }

    public int getNumid() {
        return numid;
    }

    public void setNumid(int numid) {
        this.numid = numid;
    }
    
      
    
    @Override
    public int hashCode() {
        return numid;
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
        final Cuentas other = (Cuentas) obj;
        return this.numid == other.numid;
    }

   
    
    
}
