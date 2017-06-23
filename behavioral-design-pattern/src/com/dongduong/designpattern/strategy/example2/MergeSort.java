package com.dongduong.designpattern.strategy.example2;

public class MergeSort implements Strategy {

	@Override
	public void sort(int[] numbers) {
		System.out.println("sorting array using merge sort strategy");
	}

}
