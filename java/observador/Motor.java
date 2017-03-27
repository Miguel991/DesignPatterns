package com.java.observador;

public class Motor implements Observador {
	
	public Motor(){}

	@Override
	public void update() {
		//accion que se realiza despues de que el objeto observado notifica algun evento
		System.out.println("El acelerador fue pisado, el motor esta acelerando!!!");		
	}
	
	

}
