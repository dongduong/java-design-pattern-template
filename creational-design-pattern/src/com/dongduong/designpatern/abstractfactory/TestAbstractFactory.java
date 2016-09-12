/**
 * Abstract Factory pattern is similar to Factory design pattern and it's factory of factories. If you are familiar with factory
 * design pattern in java, you will notice that we have a single Factory class that returns the different sub-classes bases on the
 * input provided and factory class uses if-else or switch statement to achieve this. In Abstract Factory pattern, we get rid of
 * if-else block and have a factory class for each sub-class and then an Abstract Factory class will return the sub-class based on
 * the input factory class. Check out Abstract Factory Pattern to know how to implement this pattern with example program.
 */

package com.dongduong.designpatern.abstractfactory;

public class TestAbstractFactory {

	public static void main(String[] args) {
		Computer pc = ComputerFactory.getComputer(new PCFactory("2 GB", "500 GB", "2.4 GHz"));
		Computer server = ComputerFactory.getComputer(new ServerFactory("16 GB", "1 TB", "2.9 GHz"));
		System.out.println("Abstract Factory PC Config:: " + pc);
		System.out.println("Abstract Factory Server Config:: " + server);
	}
}
