/*The Bridge Patterns intent is to decouple an abstraction from its implementation so that the two can vary independently.
It puts the abstraction and implementation into two different class hierarchies so that both can be extend independently.*/

package com.dongduong.designpattern.bridge;

public class TestBridgePattern {

	public static void main(String[] args) {
		Product product = new CentralLocking("Central Locking System");
		Product product2 = new GearLocking("Gear Locking System");
		Car car = new BigWheel(product , "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		System.out.println();
		
		car = new BigWheel(product2 , "BigWheel xz model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		System.out.println("-----------------------------------------------------");
		
		car = new Motoren(product, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
		
		System.out.println();
		
		car = new Motoren(product2, "Motoren lm model");
		car.produceProduct();
		car.assemble();
		car.printDetails();
	}

}
