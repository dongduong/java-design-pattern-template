/**
 * Prototype pattern is used when the Object creation is a costly affair and requires a lot of time and resources and you have
 * a similar object already existing. So this pattern provides a mechanism to copy the original object to a new object an then
 * modify it according to our needs. This pattern uses java cloning to copy the object. Prototype design pattern mandates that
 * the Object which you are copying should provide the copying feature. It should not be done by any other class. However whether
 * to use shallow or deep copy of the Object properties depends on the requirement and its a design decision.
 */

package com.dongduong.designpatern.prototype;

import java.util.List;

public class TestPrototypePattern {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employees employees = new Employees();
		employees.loadData();
		
		//Use the clone method to get the Employee object
		
		Employees empNew = (Employees) employees.clone();
		Employees empNew1 = (Employees) employees.clone();
		List list = empNew.getEmptyList();
		list.add("John");
		List list1 = empNew1.getEmptyList();
		list1.remove("Panka");
		
		System.out.println("empty List: " + employees.getEmptyList());
		System.out.println("empNew List: " + list);
		System.out.println("empNew1 List: " + list1);
	}

}
