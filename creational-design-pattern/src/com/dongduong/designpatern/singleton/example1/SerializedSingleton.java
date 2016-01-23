package com.dongduong.designpatern.singleton.example1;

import java.io.Serializable;

public class SerializedSingleton implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2954521849607429641L;
	
	private SerializedSingleton() {}
	
	private static class SingletonHelper {
		private static final SerializedSingleton instance = new SerializedSingleton();
	}
	
	public static SerializedSingleton getInstance(){
		return SingletonHelper.instance;
	}

}
