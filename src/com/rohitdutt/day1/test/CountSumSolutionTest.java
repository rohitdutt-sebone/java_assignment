/**
 * 
 */
package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.CountSumSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class CountSumSolutionTest {

	@Test
	void countSumTest() {
		CountSumSolution countSumSolution = new CountSumSolution();
		assertEquals(120,countSumSolution.countSum(15));
		assertEquals(15,countSumSolution.countSum(5));
	}

}
