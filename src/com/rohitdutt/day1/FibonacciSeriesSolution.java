/**
 * 
 */
package com.rohitdutt.day1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * SolutionFibonacciSeries
 * @objective This class provides method to find the fibonacci series upto n numbers
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class FibonacciSeriesSolution {
	
	/**
	 * fibonacciSeriesUptoN
	 * method to find the fibonacci series upto n numbers
	 * n is a number till you would like to find the fabonacci series
	 */
	public ArrayList<Integer> fibonacciSeriesUptoN(int n) {
		int firstNumber = 0;
		int secondNumber = 1;
		int thirdNumber;
		ArrayList<Integer> result = new ArrayList<Integer>();
		result.add(firstNumber);
		result.add(secondNumber);
		for(int i = 0; i < n - 2; i++) {
			thirdNumber = firstNumber + secondNumber;
			result.add(thirdNumber);
			firstNumber = secondNumber;
			secondNumber = thirdNumber;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		FibonacciSeriesSolution fibonacciSeriesSolution = new FibonacciSeriesSolution();
		System.out.println("Enter number");
		int input = scanner.nextInt();
		ArrayList<Integer> result = new ArrayList<Integer>();
		result = fibonacciSeriesSolution.fibonacciSeriesUptoN(input);
		for(Integer i:result) {
			System.out.println(i);
		}
	}

}
