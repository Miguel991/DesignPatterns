package com.java.decorador;

public class AutoElectrico extends AutomovilDecorador {

	public AutoElectrico(Automovil auto) {
		super(auto);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void acelerar() {
		getAuto().acelerar();
		System.out.println("y ahora usa baterias");
	}

	@Override
	public void stop() {
		getAuto().stop();
		System.out.println("y ahora es electrico");
	}

	@Override
	public void start() {
		getAuto().start();
		System.out.println("y tiene 3 baterias disponibles.");
	}

}
