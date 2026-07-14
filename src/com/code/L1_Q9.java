package com.code;

import java.util.Scanner;

// Write a program to read the marks of 5 subjects and print the total and average.

public class L1_Q9 {

	public static void main(String[] args) {

		int maths;
		int english;
		int science;
		int cs;
		int sst;

		Scanner sc = new Scanner(System.in);

		System.out.println("Maths: ");
		maths = sc.nextInt();

		System.out.println("English: ");
		english = sc.nextInt();

		System.out.println("Science: ");
		science = sc.nextInt();

		System.out.println("Computer Science: ");
		cs = sc.nextInt();

		System.out.println("Social Studies: ");
		sst = sc.nextInt();

		int total = (maths + english + science + cs + sst);
		System.out.println("Total Marks out of 500: " + total);

		int avg = (total / 5);
		System.out.println("Average: " + avg);

		sc.close();

	}

}
