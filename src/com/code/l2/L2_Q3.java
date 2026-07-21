package com.code.l2;

import java.util.Scanner;

// Write a program to read three numbers and find the largest among them.
public class L2_Q3 {
	
	public static void main(String[] args) {
		
		int num1, num2, num3;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Num1 Here:");
		num1 = sc.nextInt();
		System.out.println("Enter Num2 Here:");
		num2 = sc.nextInt();
		System.out.println("Enter Num3 Here:");
		num3 = sc.nextInt();
		System.out.println("entered numbers are : " + num1 + "," + num2 + "," + num3);
		
		if (num1 >num2 && num1> num3) {
			System.out.println(num1 + " is larger!" );
		}
		else if (num2 >num1 && num2 > num3) {
			System.out.println(num2 + " is larger!" );
		}
		else{
			System.out.println(num3 + " is larger!" );
		}
		int largest = (num1 > num2) 
			    ? (num1 > num3 ? num1 : num3) 
			    : (num2 > num3 ? num2 : num3);

			System.out.println(largest + " is larger!");
		sc.close();
	}

}
