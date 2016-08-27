package com.dongduong.designpatern.builder;

public class TestBuilderPattern {

	public static void main(String[] args) {
		// Using builder to get object in the single line of code and
		// without any inconsistent state or arguments management issues
		Computer computer = new Computer.ComputerBuilder("500 GB", "2 GB")
				.setGraphicsCardEnabled(true)
				.setBluetoothEnabled(true).build();

	}

}
