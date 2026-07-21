package com.code.l2;

import java.util.Scanner;

public class L2_Q2 {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Number Here : ");
		num = sc.nextInt();
		
		if(num == 0) {
			System.out.println("Number is Zero ");
		}
		if(num > 0) {
			System.out.println("Number is +ve ");
		}
		if(num < 0) {
			System.out.println("Number is -ve ");
		}
	}
}
