package com.dongduong.designpatern.singleton.example1;

public class StaticBlockSingleton {

	private static StaticBlockSingleton instance;
	
	private StaticBlockSingleton() {}
	
	//static block initialization
	static {
		try{
			instance = new StaticBlockSingleton();
		}
		catch (Exception e) {
			throw new RuntimeException("Exception occured in create singleton instance");
		}
	}
	
	public static StaticBlockSingleton getInstance() {
		return instance;
	}
}
