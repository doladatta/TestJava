package com.intrvw.prgrm.code;

public class SecondSmallestNumberWithoutSorting {

	public static void main(String[] args) {

		int x[] = {23,19,15,31,12,4,8,3,-1};
		
		int smallestNo = x[0];
		int secondSmallestNo = x[0];
		
		for (int i=0 ; i < x.length ; i++) {
			if(x[i] < smallestNo) {
				secondSmallestNo = smallestNo;
				smallestNo = x[i];
			}
		}
		
		System.out.println(secondSmallestNo);
		System.out.println(smallestNo);
	}

}
