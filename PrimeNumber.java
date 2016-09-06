/* Write a program  to check if a given number is prime or not. */

package com.training.loops;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		if(num<=1) {
			System.out.println("This number is neither prime"
					+ "or composite");
			return;
		}
		
		if(num%2==0) {
			System.out.println("This number is not prime");
			return;
		}
		
		for(int i=3; i<num/2; i+=2) {
			if(num%i==0) {
				System.out.println("This number is not prime");
				return;
			}
		}
		System.out.println("This number is a prime number");
	}

}
