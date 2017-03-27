package com.java.observador;

import java.util.ArrayList;

public class Acelerador implements ObjetoObservable {
	
	//Un objeto observable puede tener varios objetos observadores
	//que van a ser notificados al momento que el objeto observable realice alguna accion o evento
	private ArrayList<Observador> observadores;
	
	
	public Acelerador(){
		observadores = new ArrayList<Observador>();
	}
	
	public void pisarElAcelerador(){
		//el acelerador es pisado y hay que avisar al motor
		notificar();
	}
	
	public void enlazarObservador(Observador o){ 
		observadores.add(o);
		}

	@Override
	public void notificar() {
		for(Observador o: observadores){o.update();}		
	}

	@Override
	public void eliminarObservador(Observador o) {
		observadores.remove(o);
				
	}

}
