package com.intrvw.prgrm.code;

/**
 * Problem Statement
 * @author DOLADATTA
 * 
 * Write a simple Java program which will print Fibonacci series, e.g. 1 1 2 3 5 8 13 ... . up to a given number. 
 * We prepare for cross questions like using iteration over recursion 
 * and how to optimize the solution using caching and memorization.
 * 
 * 
Read more: https://javarevisited.blogspot.com/2017/07/top-50-java-programs-from-coding-Interviews.html#ixzz6XXpuHG7G
 */

public class FibonacciSeries {

	public static void main(String[] args) {
		// How many fibonacci numbers
		int noOfFibonacciNos = 10;
		int a1 = 1;
		int a2 = 1;
		int index = 1;
		while(index <= noOfFibonacciNos) {
			if(index == 1) System.out.println(index + " : " + a1);
			else if(index == 2) System.out.println(index + " : " + a2);
			else {
				int next = a1 + a2;
				System.out.println(index + " : " + next);
				a1 = a2;
				a2 = next;
			}
			++index;
		}
		System.out.println("--------------------------");
		// Fibonacci less than a number
		int fibonacciLessThanNo = 150;
		a1 = 1;
		a2 = 1;
		index = 1;
		while (a1+a2 < fibonacciLessThanNo) {
			if(index == 1) System.out.println(index + " : " + a1);
			else if(index == 2) System.out.println(index + " : " + a2);
			else {
				int next = a1 + a2;
				System.out.println(index + " : " + next);
				a1 = a2;
				a2 = next;
			}
			++index;
		}

	}

}
