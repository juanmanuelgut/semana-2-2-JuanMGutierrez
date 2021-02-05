/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Perro {
	private String nombre;
	private String color;
	private int nivelHambre;
	
	
	//geters y seters
	
	
	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getColor() {
		return color;
	}


	public void setColor(String color) {
		this.color = color;
	}


	public int getNivelHambre() {
		return nivelHambre;
	}


	public void setNivelHambre(int nivelHambre) {
		this.nivelHambre = nivelHambre;
	}
	
	public Perro() {
		// TODO Auto-generated constructor stub
	}
	
	public Perro(String color) {
		this.color = color;
	}


	public Perro(String nombre, String color, int nivelHambre) {
		this.nombre = nombre;
		this.color = color;
		this.nivelHambre = nivelHambre;
	}
	
	public String toString() {
		return "Perro: Nombre: " + this.nombre + " Color: " +this.color;
		
	}
	
	

}
