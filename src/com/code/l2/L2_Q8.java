package com.code.l2;

import java.util.Scanner;

//Write a program to read the marks of a student and print the grade (A/B/C/D/Fail)
public class L2_Q8 {
	
public static void main(String[] args) {
	
	int marks;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your marks here out of 100 : ");
	marks = sc.nextInt();
	
	if (marks >= 90) {
		System.out.println("A Grade");
	}else if (marks >=80) {
		System.out.println("B Grade");
	}else if (marks >=70) {
		System.out.println("C Grade");
	}else if (marks >=60) {
		System.out.println("D Grade");
	}else {
		System.out.println("Sorry you Failed!");
	}
	sc.close();
}

}
