package com.code;
import java.util.Scanner;

//Write a program to read two numbers and print their sum.

public class L1_Q2_V2 {

    public static void main(String[] args) {

        int a;
        int b;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        a = sc.nextInt();

        System.out.print("Enter second number: ");
        b = sc.nextInt();

        System.out.println("Numbers: " + a + ", " + b);
        System.out.println("Sum: " + (a + b));

        sc.close();
    }
}