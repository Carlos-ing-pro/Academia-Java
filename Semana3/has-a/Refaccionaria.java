/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hasa;

import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author cg873
 */
public class Refaccionaria {
    String lugar;
    List<Cuentas> listaC;
    

    public Refaccionaria(String lugar) {
        super();
        this.lugar = lugar;
        listaC = new LinkedList<>();
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public List<Cuentas> getListaC() {
        return listaC;
    }

    public void setListaC(List<Cuentas> listaC) {
        this.listaC = listaC;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(lugar);
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
        final Refaccionaria other = (Refaccionaria) obj;
        return Objects.equals(this.lugar, other.lugar);
    }

    
    public void setCuenta(Cuentas c1){
        listaC.add(c1);
    }
    
    public Cuentas getCuenta(int numc){
        int i = listaC.indexOf(new Cuentas(null,numc));
		System.out.println("Indice: "+i);
		Cuentas c1 = null;
		if (i == -1)
			return null;
		else 
			c1 = listaC.get(i); //<==
		return new Cuentas(c1.getNombre(),c1.getNumid());
    }
    
    
}
