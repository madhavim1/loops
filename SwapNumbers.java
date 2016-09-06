/* Write a program that swaps 2 given numbers. 
 * You need to have 2 separate functions in the program.
 * --> One Function should swap the numbers without any third 
 * new variable.
 * --> Second function should swap the numbers using a third 
 * variable.
*/

package com.training.loops;

import java.util.Scanner;

public class SwapNumbers {
	int x;
	int y;
	
	public void swapOne() { 
		x = x + y;  
		y = x - y;  
		x = x - y ; 	
	}
	
	public void swapTwo() {
		int temp = x;
		x = y;
		y = temp;
	}
	
	public static void main(String args[]) {
		SwapNumbers obj = new SwapNumbers();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter numbers for swapping: ");
		obj.x = scanner.nextInt();
		obj.y = scanner.nextInt();
		
		System.out.println("Before swapping: x="+obj.x+" y="+obj.y);
		
		obj.swapOne();
		System.out.println("After swapping with no third variable: x="+obj.x+" y="+obj.y);
		
		obj.swapTwo();
		System.out.println("After swapping with third variable: x="+obj.x+" y="+obj.y);
		
	}

}
