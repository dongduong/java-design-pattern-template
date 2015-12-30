package com.dongduong.designpattern.adapter.example1;

import com.dongduong.designpattern.adapter.example1.entity.Volt;

public class AdapterPatternTest {

	public static void main(String[] args) {
		testClassAdapter();
		testObjectAdapter();
	}

	private static void testClassAdapter() {
		SocketAdapter socketAdapter = new SocketClassAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
	}

	private static void testObjectAdapter() {
		SocketAdapter socketAdapter = new SocketObjectAdapterImpl();
		Volt v3 = getVolt(socketAdapter, 3);
		Volt v12 = getVolt(socketAdapter, 12);
		Volt v120 = getVolt(socketAdapter, 120);
		
	}
	
	private static Volt getVolt(SocketAdapter sockAdapter, int i){
		switch (i) {
		case 3:
			return sockAdapter.get3Volt();
		case 12:
			return sockAdapter.get12Volt();
		case 120:
		default:
			return sockAdapter.get120Volt();
		}
	}

}
