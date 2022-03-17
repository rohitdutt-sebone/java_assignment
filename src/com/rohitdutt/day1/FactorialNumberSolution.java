/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionFactorialNumber
 * @Objective This class provides method to find the factorial of a given number
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class FactorialNumberSolution {
	
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
		Scanner scanner = new Scanner(System.in);
		FactorialNumberSolution factorialNumberSolution = new FactorialNumberSolution();
		System.out.println("Enter number");
		int input = scanner.nextInt();
		System.out.println(factorialNumberSolution.factorialNumber(input));
	}

}
