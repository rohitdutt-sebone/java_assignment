package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionReverseString
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class SolutionReverseString {
	
	/**
	 * reverseString
	 * method to reverse a string
	 * input is a string you would like to reverse
	 * returns a reverses string
	 */
	public String reverseString(String input) {
		int i = 0;
		int j = input.length() - 1;
		char[] inputCharArray = input.toCharArray();
		while(i < j) {
			char temp = inputCharArray[i];
			inputCharArray[i] = inputCharArray[j];
			inputCharArray[j] = temp;
			i++;
			j--;
		}
		String result = new String(inputCharArray);
		return result;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		SolutionReverseString solutionReverseString = new SolutionReverseString();
		System.out.println("Enter string");
		String input = sc.nextLine();
		System.out.println(solutionReverseString.reverseString(input));
	}

}
