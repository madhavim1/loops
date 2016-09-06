/* Write a program  to calculate factorial of a given number. 
 * You need to compute the factorial with one logic that uses recursion 
 * and another logic without recursion.
 */

package com.training.loops;
import java.util.Scanner;

public class Factorial {
	
	public static int factorial(int n) {
		int fact = 1;
		for(int i= 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}
	
	public static int factorialRecursion(int n) {
		if(n<=0)
			return 1;
		return n*factorialRecursion(n-1);
	}
	
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int num = scanner.nextInt();
		System.out.println("Factorial of "+num+"is "
				+ Factorial.factorial(num));
		System.out.println("Factorial of "+num+"using Recursion "
				+ Factorial.factorialRecursion(num));
	}	

}
