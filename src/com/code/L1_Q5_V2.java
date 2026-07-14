package com.code;

import java.util.Scanner;

public class L1_Q5_V2 {

	public static void main(String[] args) {

		int l;
		int b;

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Length : ");
		l = sc.nextInt();
		
		System.out.println("Enter Breadth : ");
		b = sc.nextInt();
		
		int area = (l * b);
		int perimeter = 2 * (l + b);

		System.out.println("Area : " + area);
		System.out.println("Perimeter : " + perimeter);
		
		sc.close();
	}
}
