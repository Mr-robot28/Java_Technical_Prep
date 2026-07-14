package com.code;

//Write a program to read seconds and convert them into hours, minutes and seconds.

public class L1_Q10 {

	public static void main(String[] args) {

		int sec = 7325;

		if (sec <= 86400) {

			int hr = (sec / 3600);
			System.out.println("hr:" + hr);
			sec = sec % 3600;

			int min = (sec / 60);
			System.out.println("min:" + min);

			int seconds = (sec % 60);
			System.out.println("sec:" + seconds);
			System.out.println();
		//	System.out.println("Time: " + hr + (":") + min + (":") + seconds);
			System.out.printf("Time: %02d:%02d:%02d", hr, min, seconds);
		} else {
			System.out.println("invalid input!");
		}

	}
}
