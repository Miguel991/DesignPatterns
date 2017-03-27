package com.java.decorador;

public class FordFalcon implements Automovil {
	
	private String nombre;
	
	public FordFalcon(String nombre){
		this.nombre = nombre;
		
	}

	@Override
	public void acelerar() {
		System.out.println("acelero");		
	}

	@Override
	public void stop() {
		System.out.println("freno");		
		
	}

	@Override
	public void start() {
		System.out.println("arranco");		
		
	}

}
