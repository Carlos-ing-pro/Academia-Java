/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.optionalp;

import java.util.Optional;

/**
 *
 * @author cg873
 */
public class OptionalP {

    public static void main(String[] args) {
        
       
    }
    
    public static  void givenOptional_whenIfPresentWorks_thenCorrect() {
	    Optional<String> opt = Optional.ofNullable(null);
	    opt.ifPresent(name -> 
	    		System.out.println(name.length()));
	    System.out.println("*");
	}
	
	static public void givenOptional_whenIsPresentWorks_thenCorrect() {
		boolean b;
	    Optional<String> opt = Optional.of("Baeldung");
	    b = opt.isPresent(); 
	    System.out.println(b); //true
	    
	    opt = Optional.ofNullable(null);
	    b = opt.isPresent();
	    System.out.println(b); //false
	}
	
	
	public static  void givenNonNull_whenCreatesNullable_thenCorrect() {
	    String name = "baeldung";
	    Optional<String> opt = Optional.ofNullable(name);
	    System.out.println(opt);
	    boolean b = opt.isPresent();
	    System.out.println(b);
	}

}
