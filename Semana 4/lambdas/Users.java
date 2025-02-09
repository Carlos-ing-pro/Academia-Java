/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lambdas;

/**
 *
 * @author cg873
 */
public class Users {
    
        String nombre;
	int edad;
	double sueldo;

    public Users(String nombre, int edad, double sueldo) {
        this.nombre = nombre;
        this.edad = edad;
        this.sueldo = sueldo;
    }

    @Override
    public String toString() {
        return "Users{" + "nombre=" + nombre + ", edad=" + edad + ", sueldo=" + sueldo + '}';
    }
        
        
}

