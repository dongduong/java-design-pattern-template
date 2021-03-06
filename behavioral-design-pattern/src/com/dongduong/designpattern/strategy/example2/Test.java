package com.dongduong.designpattern.strategy.example2;

public class Test {

	public static void main(String[] args) {
		// we can provide any strategy to do the sorting
		int[] var = { 1, 2, 3, 4, 5 };
		Context ctx = new Context(new BubbleSort());
		ctx.arrange(var);

		// we can change the strategy without changing Context class
		ctx = new Context(new QuickSort());
		ctx.arrange(var);

	}

}
