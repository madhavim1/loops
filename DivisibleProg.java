/* Write a program print "ping" if a number is divisible by 3,"pong"
 * if a number is divisible by 5, and "ping pong" if number is divisible 
 * by both, else print the number.
 */
		  
package com.training.loops;

import java.util.Scanner;

public class DivisibleProg {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number :");
		int n = scanner.nextInt();
		
		if (n%15==0)
			System.out.println("ping pong");
		else if (n%3==0)
			System.out.println("ping");
		else if (n%5==0)
			System.out.println("pong");
		else 
			System.out.println(n);
		
	}

}
