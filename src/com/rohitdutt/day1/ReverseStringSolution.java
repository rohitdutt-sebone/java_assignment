package com.rohitdutt.day1;

import java.util.Scanner;

/**
 * SolutionReverseString
 * @objecyive This class provides method to reverse a string
 * @author Rohitdutt Parsai
 * 17/03/2022
 */
public class ReverseStringSolution {
	
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
		Scanner scanner = new Scanner(System.in);
		ReverseStringSolution reverseStringSolution = new ReverseStringSolution();
		System.out.println("Enter string");
		String input = scanner.nextLine();
		System.out.println(reverseStringSolution.reverseString(input));
	}

}
