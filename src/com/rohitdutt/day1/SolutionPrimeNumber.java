package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionPrimeNumber
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class SolutionPrimeNumber {
	
	/**
	 * isPrime
	 * method to find if a given number is prime or not
	 * num is a number you would like to find if it is a prime number
	 * returns boolean
	 */
	public boolean isPrime(int num) {
		int i = 1;
		int count = 0;
		while(i <= num) {
			if(num%i == 0) {
				count++;
			}
			i++;
		}
		if(count <= 2) {
			return true;
		}else {
			return false;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionPrimeNumber solutionPrimeNumber = new SolutionPrimeNumber();
		System.out.println("Enter number");
		int input = sc.nextInt();
		System.out.println(solutionPrimeNumber.isPrime(input));
	}

}
