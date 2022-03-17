/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionCountNumberOfDigitsInNumber
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class SolutionCountNumberOfDigitsInNumber {
	
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
		Scanner sc = new Scanner(System.in);
		SolutionCountNumberOfDigitsInNumber solutionCountNumberOfDigitsInNumber = new SolutionCountNumberOfDigitsInNumber();
		System.out.println("Enter number");
		int input = sc.nextInt();
		System.out.println(solutionCountNumberOfDigitsInNumber.countNumberOfDigitsInNumber(input));
	}

}
