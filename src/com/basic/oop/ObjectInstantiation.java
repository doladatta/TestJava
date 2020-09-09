package com.basic.oop;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ObjectInstantiation {

	public static void main(String[] args) {
		// In how many ways we create Java Objects
		// 1: new operator
		A objA1 = new A();
		System.out.println(objA1);
		
		// 2: Class newInstance method
		try {
			A objA2 = A.class.newInstance();
			System.out.println(objA2);
		} catch (InstantiationException | IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// 3: newInstance() method of Constructor class
		Constructor<A> constr = null;
		A objA3 = null;
		try {
			constr = A.class.getConstructor();
		} catch (NoSuchMethodException | SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			if(constr != null)
				objA3 = constr.newInstance();
		} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
				| InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(objA3);
		
		// 4: Object.clone() method
		ClonableA clnA1 = new ClonableA();
		try {
			ClonableA clnA2 = (ClonableA) clnA1.clone();
			System.out.println(clnA2);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}

class A {
	int a;
	String b;
	

	public int getA() {
		return a;
	}


	public void setA(int a) {
		this.a = a;
	}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "A [a=" + a 
				+ ", getClass()=" + getClass() 
				+ ", hashCode()=" + hashCode() 
//				+ ", toString()=" + super.toString() 
				+ "]";
	}
	
}

class SubA extends A {
	int a;
	String b;
	
}




class ClonableA implements Cloneable {
	int a;

	@Override
	public String toString() {
		return "A [a=" + a 
				+ ", getClass()=" + getClass() 
				+ ", hashCode()=" + hashCode() 
//				+ ", toString()=" + super.toString() 
				+ "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}
	
	// Not mandatory , but need to override the clone method from the Object class
	
	
}
