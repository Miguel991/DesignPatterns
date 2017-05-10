package com.java.singleton;
/*
 *HMC Software Development
 *
 *Singleton for threads
 * 
 */
public class DoubleCheckSingleton {
	
	private static volatile DoubleCheckSingleton singletonInstance = null;
	
	private DoubleCheckSingleton(){}
	
	public static DoubleCheckSingleton getInstance(){
		if(singletonInstance == null){
			synchronized (DoubleCheckSingleton.class){
				if(singletonInstance == null){
					singletonInstance = new DoubleCheckSingleton();
				}
			}
		}
		return singletonInstance;
	}

}
