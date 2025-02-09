/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lambdas;

import java.util.function.Function;

/**
 *
 * @author cg873
 */
public class FunctionP {
    
    public static void main(String[] args) {
        
        Function<String,Integer> f1 = p -> p.length();
        
       int num = f1.apply("Hola ");
        System.out.println(num);
        
        Function<Integer,String> p1 = e ->e.toString();
        
        String res= p1.apply(50);
        System.out.println(p1);
    }
    
}
