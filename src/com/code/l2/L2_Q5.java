package com.code.l2;

import java.util.Scanner;

//Write a program to read a year and check whether it is a leap year or not

public class L2_Q5 {
public static void main(String[] args) {
	

	int year;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the Year Here: ");
	year = sc.nextInt();
	
	if (year % 4 == 0) {
		System.out.println(year + " is a leap year");
	}else if(year % 100 == 0){
		System.out.println(year + " is a leap year");
	}else if( year % 400 == 0) {
		System.out.println(year + " is a leap year");
	}else {
		System.out.println(year + " is not a leap year");
	}
	
	if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
	    System.out.println(year + " is a leap year");
	} else {
	    System.out.println(year + " is not a leap year");
	}
	sc.close();
	
}
}
