package com.java.decorador;

public abstract class AutomovilDecorador implements Automovil {
	
	private Automovil auto;
	
	public AutomovilDecorador(Automovil auto){
		this.auto = auto;
	}
	//getAuto solo lo pueden usar las clases que hereden de automovilDecorador
	protected Automovil getAuto(){
		return auto;
	}

}
