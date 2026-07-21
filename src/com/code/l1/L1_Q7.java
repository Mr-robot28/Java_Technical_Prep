package com.code.l1;

// Write a program to swap two numbers without using a third variable.

public class L1_Q7 {

	public static void main(String[] args) {

		int num1 = 5000;
		int num2 = 6007;
		System.out.println("Before Swaping");
		System.out.println("num1 :" + num1);
		System.out.println("num2 :" + num2);
		System.out.println();

		System.out.println("After Swaping");

		num1 = num1 + num2;
		System.out.println("num1: " + num1);

		num2 = num1 - num2;
		System.out.println("num2: " + num2);

		num1 = num1 - num2;
		System.out.println("num1: " + num1);

	}

}
