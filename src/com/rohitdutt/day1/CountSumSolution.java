/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionCountSum
 * @objective This class provides method to count the sum of number till the given Number
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class CountSumSolution {
	
	/**
	 * countSum
	 * method to count the sum of number till the given Number
	 * n is a number till which you like to count the sum
	 * returns a int sum
	 */
	public int countSum(int n) {
		int sum = 0;
		for(int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountSumSolution countSumSolution = new CountSumSolution();
		System.out.println("Enter number");
		int input = scanner.nextInt();
		System.out.println(countSumSolution.countSum(input));
	}
}
