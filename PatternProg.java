/* Write a program  that prints a pattern like below.
    		*
    		**
    		***
    		****
    		*****
    		******
*/

package com.training.loops;

public class PatternProg {
	
	public static void main(String args[]) {
		for(int i=0; i<6; i++) {
			for(int j=0; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
	}

}
