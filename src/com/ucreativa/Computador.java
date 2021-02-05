/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Computador {
	
	//Atributos
	private String Marca; 
	private String sistemaOperativo;
	private String numeroSerie;
	private boolean encendido;
	
	//geters y seters

	public String getMarca() {
		return Marca;
	}

	public void setMarca(String marca) {
		Marca = marca;
	}

	public String getSistemaOperativo() {
		return sistemaOperativo;
	}

	public void setSistemaOperativo(String sistemaOperativo) {
		this.sistemaOperativo = sistemaOperativo;
	}

	public String getNumeroSerie() {
		return numeroSerie;
	}

	public void setNumeroSerie(String numeroSerie) {
		this.numeroSerie = numeroSerie;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	//Contructores
	public Computador() {
		// TODO Auto-generated constructor stub
	}

	public Computador(String marca, String sistemaOperativo, String numeroSerie, boolean encendido) {
		Marca = marca;
		this.sistemaOperativo = sistemaOperativo;
		this.numeroSerie = numeroSerie;
		this.encendido = encendido;
	}
	
	@Override
	public String toString() {
		
		return "Computador: Marca: " + this.Marca + " Sistema operativo: " + this.sistemaOperativo;
		
	}
	
	public void encender() {
		
		this.encendido = true;
		
	}
	
	public void apagar() {
		
		this.encendido = false;
	}
	
	public void reiniciar() {
		
	}

}
