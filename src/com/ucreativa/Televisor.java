/**
 * 
 */
package com.ucreativa;

/**
 * @author juangutierrez
 *
 */
public class Televisor {

	private String marca;
	private int canalActual;
	private boolean tieneSenal;
	private String entradaVideo;
	private boolean encendido;

	//getters y setters

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCanalActual() {
		return canalActual;
	}

	public void setCanalActual(int canalActual) {
		this.canalActual = canalActual;
	}

	public boolean isTieneSenal() {
		return tieneSenal;
	}

	public void setTieneSenal(boolean tieneSenal) {
		this.tieneSenal = tieneSenal;
	}

	public String getEntradaVideo() {
		return entradaVideo;
	}

	public void setEntradaVideo(String entradaVideo) {
		this.entradaVideo = entradaVideo;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}
	
	//Metodos Constructores
	
	public Televisor() {
		// TODO Auto-generated constructor stub
	}

	public Televisor(String marca, int canalActual, boolean tieneSenal, String entradaVideo, boolean encendido) {
		super();
		this.marca = marca;
		this.canalActual = canalActual;
		this.tieneSenal = tieneSenal;
		this.entradaVideo = entradaVideo;
		this.encendido = encendido;
	}
	
	public void cambiarCanal(int cantidadCanales) {
		
		this.canalActual = this.canalActual + cantidadCanales;
		
	}
	
	public void encender() {
		
		this.encendido = true;
		
	}
	
	public void apagar() {
		
		this.encendido = false;
	}
	
	public void reiniciar() {
		
		
		
	}
	
	@Override
	public String toString() {
		
		return "Televisor: Marca: " + this.marca + " Canal Actual: " + this.canalActual + " esta encendida: " + Boolean.toString(this.encendido);
		
	}

}
