package com.java.observador;

public interface ObjetoObservable {
	
	public void notificar(); //avisa al observador
	public void eliminarObservador(Observador o);

}
