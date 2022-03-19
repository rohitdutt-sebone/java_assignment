/**
 * 
 */
package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.FactorialNumberSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class FactorialNumberSolutionTest {

	@Test
	void factorialNumberTest() {
		FactorialNumberSolution factorialNumberSolution = new FactorialNumberSolution();
		assertEquals(120,factorialNumberSolution.factorialNumber(5));
		assertEquals(479001600,factorialNumberSolution.factorialNumber(12));
	}

}
