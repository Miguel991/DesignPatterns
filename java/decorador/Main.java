package com.java.decorador;
/*
 * con el patron de diseño decorador podemos agregar funcionalidades extras
 * a nuestros objetos pasandolos como parametro a una clase decorador
 * por ejemplo podriamos aplicarlo en un video juego donde tengamos un
 * objeto persona y el cual despues de ganar un bonus tenga otros
 * poderes o funcionalidades extras
 * tambien podemos tener varios decoradores anidados 
 * lo cual nos permite pasar un objeto a un decorador y luego
 * ese mismo objeto pasarlo a otro decorador y asi sucesivamente
 * */

public class Main {

	public static void main(String[] args) {
		
			Automovil auto = new FordFalcon("fordFalcon");
			auto.acelerar();
			auto.start();
			auto.stop();
			System.out.println("===============================================");
			auto = new AutoElectrico(auto);
			auto.acelerar();
			auto.start();
			auto.stop();
			
			
	}

}
