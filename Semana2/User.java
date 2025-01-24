/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.inmutabilidad;

import java.util.Objects;

/**
 *
 * @author cg873
 */
public final class User {
    
    private final String nombre;
    private final String password;
    private final int edad;
    private final boolean admin;

    public User(String nombre, String password, int edad, boolean admin) {
        this.nombre = nombre;
        this.password = password;
        this.edad = edad;
        this.admin = admin;
    }

    @Override
    public String toString() {
        return "User{" + "nombre=" + nombre + ", password=" + password + ", edad=" + edad + ", admin=" + admin + '}';
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
        final User other = (User) obj;
        if (this.edad != other.edad) {
            return false;
        }
        if (this.admin != other.admin) {
            return false;
        }
        if (!Objects.equals(this.nombre, other.nombre)) {
            return false;
        }
        return Objects.equals(this.password, other.password);
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getPassword() {
        return password;
    }

    public int getEdad() {
        if (edad<=18) {
            System.out.println("No tiene la edad suficiente."
                    + "No es posible registrarlo.");
        }
        return edad;
    }

    public boolean isAdmin() {
        return admin;
    }
    
    
    
}
