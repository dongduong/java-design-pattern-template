/* The intent of the Decorator Design Pattern is to attach additional responsibilities to an object dynamically.
 *  Decorators provide a flexible alternative to sub-classing for extending functionality. 
 *  The pattern is used to extend the functionality of an object dynamically without having to change the original class source or using 
 *  inheritance. This is accomplished by creating an object wrapper referred to as a Decorator around the actual object.*/

package com.dongduong.designpattern.decorator;

import java.text.DecimalFormat;

public class TestDecoratorPattern {

	public static void main(String[] args) {
		DecimalFormat dformat = new DecimalFormat("#.##");
		Pizza pizza = new SimplyVegPizza();

		pizza = new RomaTomatoes(pizza);
		pizza = new GreenOlives(pizza);
		pizza = new Spinach(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));

		pizza = new SimplyNonVegPizza();

		pizza = new Meat(pizza);
		pizza = new Cheese(pizza);
		pizza = new Cheese(pizza);
		pizza = new Ham(pizza);

		System.out.println("Desc: " + pizza.getDesc());
		System.out.println("Price: " + dformat.format(pizza.getPrice()));
	}

}
