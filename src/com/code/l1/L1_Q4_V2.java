package com.code.l1;

import java.util.Scanner;

public class L1_Q4_V2 {

	public static void main(String[] args) {

		int r;
		double pi = 3.142;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Radius : ");
		r = sc.nextInt();

		double area = (pi * (r * r));
		double circumference = (2 * pi * r);

		System.out.println("Area of Circle: " + area);
		System.out.println("Circumference of Circle: " + circumference);

		sc.close();
	}

}
