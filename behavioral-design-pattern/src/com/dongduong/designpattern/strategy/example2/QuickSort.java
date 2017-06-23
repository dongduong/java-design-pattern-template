package com.dongduong.designpattern.strategy.example2;

public class QuickSort implements Strategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("sorting array using quick sort strategy");
	}

}
