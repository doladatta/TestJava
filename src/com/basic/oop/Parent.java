package com.basic.oop;

public class Parent {
	public int a;
	public String b;
	public Parent(int a, String b) {
		super();
		this.a = a;
		this.b = b;
	}
	@Override
	public String toString() {
		return "Parent [a=" + a + ", b=" + b + "]";
	}

	
}
