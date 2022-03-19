/**
 * 
 */
package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.CountNumberOfDigitsInNumberSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class CountNumberOfDigitsInNumberSolutionTest {

	@Test
	void test() {
		CountNumberOfDigitsInNumberSolution countNumberOfDigitsInNumberSolution = new CountNumberOfDigitsInNumberSolution();
		assertEquals(3, countNumberOfDigitsInNumberSolution.countNumberOfDigitsInNumber(155));
		assertEquals(7, countNumberOfDigitsInNumberSolution.countNumberOfDigitsInNumber(1234567));
		assertEquals(2, countNumberOfDigitsInNumberSolution.countNumberOfDigitsInNumber(15));
		assertEquals(1, countNumberOfDigitsInNumberSolution.countNumberOfDigitsInNumber(9));
	}

}
