package com.code.l2;

import java.util.Scanner;

// Write a program to read a character and check whether it is an alphabet, digit or special
//symbol.
public class L2_Q7 {
	
	public static void main(String[] args) {

		char c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the character here: ");
		c = sc.next().charAt(0);

		if ((c>='A' && c<='Z') || (c>='a' && c<='z')) {

			System.out.println(c + " is an Alphabet");

		} else if ((c>='0' && c<='9')){
			System.out.println(c + " is a digit");

		}else {
			System.out.println(c + " is a Special Symbol");
		}
		sc.close();
	}

}
