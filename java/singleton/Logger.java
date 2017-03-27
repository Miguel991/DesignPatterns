package com.java.singleton;

public class Logger {
	
	private static Logger log;
	private String valor;
	
	//private para que no se pueda crear mas objetos de esta clase
	private Logger(){
		
	}
	//Si usamos threads necesitamos que este metodo sea synchronized
	//para evitar que este metodo sea llamado al mismo tiempo
	
	public static synchronized Logger getInstance(){
		//Esto hace que solo exista una instancia de la clase Logger
		if(log == null){
			log = new Logger();
		}
		return log;
	}
	public void imprimir(String texto){
		System.out.println(texto);
	}
	public void setValor(String valor){
		this.valor = valor;
	}
	public String getValor(){
		return this.valor;
	}

}
  