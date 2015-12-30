package com.dongduong.designpattern.adapter.example1;

import com.dongduong.designpattern.adapter.example1.entity.Socket;
import com.dongduong.designpattern.adapter.example1.entity.Volt;

public class SocketObjectAdapterImpl implements SocketAdapter {
	
	//Using Composition for adapter pattern\
	private Socket socket = new Socket();

	@Override
	public Volt get120Volt() {
		return socket.getVolt();
	}

	@Override
	public Volt get12Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt, 10);
	}

	@Override
	public Volt get3Volt() {
		Volt volt = socket.getVolt();
		return convertVolt(volt, 40);
	}

	private Volt convertVolt(Volt volt, int i) {
		return new Volt(volt.getVolts()/i);
	}

}
