package com.code;

import java.util.Scanner;

public class L1_Q3_V2 {

	public static void main(String args[]) {

		int a;
		int b;

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first number: ");
		a = sc.nextInt();

		System.out.print("Enter second number: ");
		b = sc.nextInt();

		System.out.println("Sum : " + (a + b));
		System.out.println("Difference : " + (a - b));
		System.out.println("Product : " + (a * b));
		System.out.println("Quotient : " + (a / b));

		sc.close();
	}

}
