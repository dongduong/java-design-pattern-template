package com.dongduong.designpattern.strategy.example2;

public class InsertionSort implements Strategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("sorting array using insertion sort strategy");
	}

}
