/* Write a program  that accepts input from the command line 
 * and then prints them. */

package com.training.loops;

public class ReadingFromKB {

	public static void main(String[] args) {
		for(String s: args) {
			System.out.print(s +" ");			
		}
	}
}
