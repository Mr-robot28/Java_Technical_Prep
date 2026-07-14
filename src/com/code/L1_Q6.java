package com.code;

// Write a program to swap two numbers using a third variable.

public class L1_Q6 {

	public static void main(String[] args) {

		int num1 = 10;
		int num2 = 20;
		System.out.println("Before Swaping");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		System.out.println();
		int temp = num1;
		// System.out.println("temp);
		System.out.println("After Swaping");
		num1 = num2;
		System.out.println("num1 : " + num1);

		num2 = temp;
		System.out.println("num2 : " + num2);

	}

}
