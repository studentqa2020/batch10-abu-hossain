package com.abstraction.practice;

public class ChildClass extends Employees {

	@Override
	 void getName() {
		// TODO Auto-generated method stub
	System.out.println("Mahbub");	
	}

	@Override
	 void getlocation() {
		// TODO Auto-generated method stub
	System.out.println("PA");	
	}

	@Override
	 void getSalary() {
		// TODO Auto-generated method stub
	System.out.println("200000");	
	}

	@Override
	 void getId() {
		// TODO Auto-generated method stub
		System.out.println("012");
	}
	public static void main(String[] args) {
		ChildClass obj = new ChildClass();
		obj.getName();
		obj.getlocation();
		obj.getSalary();
		obj.getId();
	}	

}
