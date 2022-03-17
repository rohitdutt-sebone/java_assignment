package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionPrimeNumber
 * @objective This class provides method to find if a given number is prime or not
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class PrimeNumberSolution {
	
	/**
	 * isPrime
	 * method to find if a given number is prime or not
	 * num is a number you would like t	o find if it is a prime number
	 * returns boolean
	 */
	public boolean isPrime(int num) {
		boolean result;
		int i = 1;
		int count = 0;
		while(i <= num) {
			if(num%i == 0) {
				count++;
			}
			i++;
		}
		if(count <= 2) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		PrimeNumberSolution primeNumberSolution = new PrimeNumberSolution();
		System.out.println("Enter number");
		int input = scanner.nextInt();
		System.out.println(primeNumberSolution.isPrime(input));
	}

}
