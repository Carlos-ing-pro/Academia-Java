/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.lambdas;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

/**
 *
 * @author cg873
 */
public class Lambdas {

    public static void main(String[] args) {
        
        
        Consumer<String> c1 = s-> System.out.println(s);
        
        c1.accept("Hola");
        
        List<Users> listaUsuarios = List.of(
			new Users("Jorge",25,250.00), 
			new Users("Luis",20,1000), 
			new Users("Gonzalo",30,400.00), 
			new Users("Pepe",45,500.00), 
			new Users("Lidia",20,600.00), 
			new Users("Hernesto",50,1000.00) 
		);
        
        
        listaUsuarios  = new ArrayList<>(listaUsuarios);
        
     
        
        listaUsuarios.forEach(u -> System.out.println(u));
    }
}
