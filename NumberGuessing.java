package com.tasks;

import java.util.*;
import java.lang.Math;

public class NumberGuessing {
	static Scanner sc = new Scanner(System.in);

	public static void GuessNumber() {
		int answer = (int) (Math.random() * 100) + 1;
		int trials = 5, i;
		System.out.println("I have guessed a number between 1 to 100, Try to find that number within 5 trials");
		for (i = 1; i <= trials; i++) {
			System.out.println("Guess the number");
			int num = 0;
			num = sc.nextInt();
			if (num == answer) {
				System.out.println("Hurrey you guessed the right number in " + i + " times");
				break;
			} else if (num < answer) {
				System.out.println("Please enter a bigger number than " + num);
			} else if (num > answer) {
				System.out.println("Please enter a smaller number than " + num);
			}
		}
		System.out.println("End of Trials!!!");
		System.out.println();
		System.out.println("You have exceeded the trials, the number was " + answer);
	}

	public static void main(String args[]) {
		GuessNumber();
	}
}
