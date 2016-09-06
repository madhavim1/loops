
/* Write a program that prints a fibonaci series that is a sequence of numbers 
 * like 0 1 1 2 3 5 8.You can vary the number of elements to be printed meaning you 
 * can print 10 numbers or 15 or 20 or any desired number. 
 * */

package com.training.loops;

import java.util.Scanner;

public class FibonaciSeries {
	
	public static void main (String args[]) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the highest range for Fibonaci series: ");
		int num = scanner.nextInt();
		scanner.close();
		int f0 = 0;
		int f1 = 1;
		for(int i=0; i<num; i++) {
			System.out.println(f0);
			int f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}
		
	}

}
