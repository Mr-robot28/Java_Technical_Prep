package com.code.l2;

import java.util.Scanner;

// Write a program to read a character and check whether it is a vowel or a consonant.
public class L2_Q6 {
	public static void main(String[] args) {

		char c;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the character here: ");
		c = sc.next().charAt(0);

		if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {

			System.out.println(c + " is a vowel");

		} else if ((c>='A' && c<='Z') || (c>='a' && c<='z')){
			System.out.println(c + " is a consonant");

		}else {
			System.out.println("invalid char!");
		}
		sc.close();
	}
}
