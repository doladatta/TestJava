package com.basic.oop;

public class Child1 extends Parent{
	public Child1(int a, String b) {
		super(a, b);
		this.a = a +1;
		this.b = b + "1";
	}
	
	public int a;
	public String b;
	@Override
	public String toString() {
		return "Child1 [a=" + a + ", b=" + b + "] " + super.toString();
	}

}
