package com.dongduong.designpatern.singleton.example1;

public class BillPughSingleton {
	private BillPughSingleton() {
	}

	private static class SingletonHelper{
		private static final BillPughSingleton INSTANCE = new BillPughSingleton();
	}
	
	public static BillPughSingleton getInstance() {
		return SingletonHelper.INSTANCE;
	}
}
