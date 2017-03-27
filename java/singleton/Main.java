package com.java.singleton;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*no se crea un nuevo objeto sino que pedimos el objeto
		 * ya instanciado en la misma clase logger
		 * creamos dos instancias que apuntan al mismo objeto
		 */
		Logger logger_1 = Logger.getInstance();
		Logger logger_2= Logger.getInstance();
		
		/* una forma simple de verificar que estamos apuntando
		 * al mismo objeto desde las dos instancias de logger
		 * es atraves de una variable privada en la clase logger
		 */
		logger_1.setValor("Valor establecido desde logger_1");
		logger_2.imprimir(logger_2.getValor());


	}

}
