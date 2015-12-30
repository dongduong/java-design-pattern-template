package com.dongduong.designpattern.adapter.example1.entity;

public class Socket {
	
	public Volt getVolt() {
		return new Volt(120);
	}

}
