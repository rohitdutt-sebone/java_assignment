/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionFactorialNumber
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class SolutionFactorialNumber {
	
	/**
	 * factorialNumber
	 * method to find the factorial of a given number
	 * n is a number you would like to find factorial
	 * returns a long result
	 */
	public long factorialNumber(int n) {
		long result = 1;
		while(n > 0) {
			result = result * n;
			n--;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionFactorialNumber solutionFactorialNumber = new SolutionFactorialNumber();
		System.out.println("Enter number");
		int input = sc.nextInt();
		System.out.println(solutionFactorialNumber.factorialNumber(input));
	}

}
