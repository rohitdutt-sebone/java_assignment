/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionCountNumberOfDigitsInNumber
 * @objective Class provides method to count the number of digits in an given Number
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class CountNumberOfDigitsInNumberSolution {
	
	/**
	 * countNumberOfDigitsInNumber
	 * method to count the number of digits in an given Number
	 * n is a number from which you like to count the number of digits
	 * returns a int result
	 */
	public int countNumberOfDigitsInNumber(int n) {
		int result = 0;
		while(n != 0) {
			n = n/10;
			result++;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		CountNumberOfDigitsInNumberSolution countNumberOfDigitsInNumberSolution = new CountNumberOfDigitsInNumberSolution();
		System.out.println("Enter number");
		int input = scanner.nextInt();
		System.out.println(countNumberOfDigitsInNumberSolution.countNumberOfDigitsInNumber(input));
	}

}
