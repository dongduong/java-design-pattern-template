package com.dongduong.designpattern.strategy.example2;

public class BubbleSort implements Strategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("sorting array using bubble sort strategy");
	}

}
