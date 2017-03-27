package com.java.observador;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Motor v8 = new Motor();
		Acelerador x = new Acelerador();
		x.enlazarObservador(v8);
		x.pisarElAcelerador();

	}

}
