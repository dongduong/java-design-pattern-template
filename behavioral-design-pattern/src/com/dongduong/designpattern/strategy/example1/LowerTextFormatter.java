package com.dongduong.designpattern.strategy.example1;

public class LowerTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[LowerTextFormatter]: "+text.toLowerCase());
	}

}
