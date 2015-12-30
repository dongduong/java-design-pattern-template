package com.dongduong.designpattern.adapter.example1;

import com.dongduong.designpattern.adapter.example1.entity.Volt;

public interface SocketAdapter {
	
	public Volt get120Volt();
	
	public Volt get12Volt();
	
	public Volt get3Volt();

}
