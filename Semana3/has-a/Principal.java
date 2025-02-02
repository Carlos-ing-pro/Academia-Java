/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hasa;

/**
 *
 * @author cg873
 */
public class Principal {
    
    
    public static void main(String[] args) {
        
    
       Refaccionaria r1 = new Refaccionaria("Ciudad");
       
       r1.setCuenta(new Cuentas(new StringBuilder("cuenta1"),1));
       r1.setCuenta(new Cuentas(new StringBuilder("cuenta2"),2));
        r1.setCuenta(new Cuentas(new StringBuilder("cuenta3"),3));
       
       Cuentas c1 = r1.getCuenta(1);
       Cuentas c2 = r1.getCuenta(3);
       
        System.out.println(c1);
    
    
    }
    
    
}
