/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Impresora {
	
	private String marca;
	private int trabajosEnCola;
	private boolean tienePapel;
	private boolean encendido;
	private boolean imprimiendo;
	
	//Geters y seters

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getTrabajosEnCola() {
		return this.trabajosEnCola;
	}

	public void setTrabajosEnCola(int trabajosEnCola) {
		this.trabajosEnCola = trabajosEnCola;
	}

	public boolean isTienePapel() {
		return this.tienePapel;
	}

	public void setTienePapel(boolean tienePapel) {
		this.tienePapel = tienePapel;
	}

	public boolean isEncendido() {
		return this.encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	//Contructores
	
	public Impresora() {
		// TODO Auto-generated constructor stub
	}
	
	public Impresora(String marca, int trabajosEnCola, boolean tienePapel, boolean encendido, boolean imprimiendo) {
		this.marca = marca;
		this.trabajosEnCola = trabajosEnCola;
		this.tienePapel = tienePapel;
		this.encendido = encendido;
		this.imprimiendo = imprimiendo;
	}
	
	//Metodos de Objeto

	public boolean isImprimiendo() {
		return this.imprimiendo;
	}

	public void setImprimiendo(boolean imprimiendo) {
		this.imprimiendo = imprimiendo;
	}

	
	
	public void anadirTrabajoEnCola(int numeroTrabajos) {
		int trabajos = this.getTrabajosEnCola();
		trabajos = trabajos + numeroTrabajos;
		this.setTrabajosEnCola(trabajos);
	}
	
	public void empezarImpresion() {
		
		this.setImprimiendo(true);
		
	}
	
	public void terminarImpresion() {
		
		this.setImprimiendo(false);
		
	}
	
	@Override
	public String toString() {
		
		return "Impresora: Marca: " + this.marca + " Trabajos en cola: " + this.trabajosEnCola + " esta encendida: " + Boolean.toString(this.encendido);
		
	}

}
