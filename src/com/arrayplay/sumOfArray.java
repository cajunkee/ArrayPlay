package com.arrayplay;

import java.lang.Math;

public class sumOfArray {

	public static void main(String[] args) {
	
		int [] arr = new int [] {1,5,6,5,4,1};
		int sum = 0;
		for (int i = 0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println("The sum of all the integers in this array is:" + sum);
		
		
	}

}
