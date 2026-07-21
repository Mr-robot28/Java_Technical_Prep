package com.code.l2;

import java.util.Scanner;

// Write a program to read a number and check whether it is even or odd.

public class L2_Q1 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Here : ");
		num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println(num + " is an even number.");
		} else {
			System.out.println(num + " is an odd number.");
		}
		sc.close();
	}

}
