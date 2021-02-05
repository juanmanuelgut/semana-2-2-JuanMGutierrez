/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Main {

	/**
	 * 
	 */
	public Main() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instancia Perro
		Perro perro1= new Perro("Firulais","Negro", 100);
		System.out.println("Instancia 1");
		System.out.println(perro1.toString());
		
		//Instancia Computador
		Computador macBook = new Computador("Apple", "MacOS 10.5.7", "XXXXXXXXX", false);
		System.out.println("Instancia 1");
		System.out.println(macBook.toString());
		
		
	}

}
