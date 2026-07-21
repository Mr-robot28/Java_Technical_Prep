package com.code.l2;

import java.util.Scanner;

//Write a program to read a number and check whether it is divisible by both 3 and 5.

public class L2_Q9 {
	public static void main(String[] args) {
		int num;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Number Here");
		num =sc.nextInt();
		
		if (num % 3 == 0 && num % 5 == 0) {
			System.out.println(num + " is Divisible by both 3 and 5");
			
		}else {
			System.out.println(num + " Num is not Divisible by both 3 and 5 ");
		}
		sc.close();
	}

}
