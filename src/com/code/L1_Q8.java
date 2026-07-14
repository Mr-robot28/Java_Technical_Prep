package com.code;

import java.util.Scanner;

public class L1_Q8 {

	public static void main(String[] args) {

		double celsius;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Celsius: ");
		celsius = sc.nextDouble();

		double fahrenheit = ((celsius *(9.0/5.0)) + 32.0);
		System.out.println("Fahrenheit:" + fahrenheit);

		sc.close();
	}
}
