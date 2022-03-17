/**
 * 
 */
package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionFibonacciSeries
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class SolutionFibonacciSeries {
	
	/**
	 * fibonacciSeriesUptoN
	 * method to find the fibonacci series upto n numbers
	 * n is a number till you would like to find the fabonacci series
	 */
	public void fibonacciSeriesUptoN(int n) {
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		System.out.println(firstNumber);
		System.out.println(secondNumber);
		for(int i = 0; i < n - 2; i++) {
			thirdNumber = firstNumber + secondNumber;
			System.out.println(thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionFibonacciSeries solutionFibonacciSeries = new SolutionFibonacciSeries();
		System.out.println("Enter number");
		int input = sc.nextInt();
		solutionFibonacciSeries.fibonacciSeriesUptoN(input);
	}

}
