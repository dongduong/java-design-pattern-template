package com.dongduong.designpattern.strategy.example1;

public class CapTextFormatter implements TextFormatter {

	@Override
	public void format(String text) {
		System.out.println("[CapTextFormatter]: "+text.toUpperCase());
	}

}
