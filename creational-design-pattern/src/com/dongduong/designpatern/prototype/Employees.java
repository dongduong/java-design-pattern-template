package com.dongduong.designpatern.prototype;

import java.util.ArrayList;
import java.util.List;

public class Employees implements Cloneable {

	private List emptyList;

	public Employees() {
		emptyList = new ArrayList();
	}

	public Employees(List list) {
		this.emptyList = list;
	}

	public void loadData() {
		// read all employees from database and put into the list
		emptyList.add("Panka");
		emptyList.add("Raj");
		emptyList.add("David");
		emptyList.add("Lisa");
	}

	public List getEmptyList() {
		return emptyList;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		List temp = new ArrayList();
		for (Object s : this.getEmptyList()) {
			temp.add(s);
		}
		return new Employees(temp);
	}

}
