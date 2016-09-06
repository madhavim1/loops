/* Write a program  to check an armstrong number i.e. 
 * whether the if we power up the each individual number 
 * to the total number of digits in the number and add them 
 * it should be equal to the number itself. 
 * For example 153 has 3 digits in it and if we do 
 * 1^3+5^3+3^3=153. FYI: ^ means is to the power.
 */
package com.training.loops;

import java.util.Scanner;

public class ArmstrongNumber {

	public static int findNumofDigits(int num) {
		int count = 0;
		while(num>0) {
			num /= 10;
			count++;
		}
		return count;
	}
	
	public static int power(int base, int exp) {
		int power =1;
		for(int j=0; j<exp; j++) {
			power *= base;
		}
		return power;
	}
	
	public static void armstrongNumber(int input, int numDigits) {
		int total = 0;
		int num=input;
		while(num>0) {
			int digit = (num%10);
			num = num/10;
			total += power(digit, numDigits);
		}
		if(total==input) {
			System.out.println("The number is a armstrong");
		} else {
			System.out.println("The number is not a armstrong");
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		int count = findNumofDigits(num);
		armstrongNumber(num, count);
	}
	
}
