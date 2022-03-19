package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.PrimeNumberSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class PrimeNumberSolutionTest {

	@Test
	void testIsPrime() {
		PrimeNumberSolution primeNumberSolution = new PrimeNumberSolution();
		assertEquals(true, primeNumberSolution.isPrime(3));
		assertEquals(false, primeNumberSolution.isPrime(1000));
		assertEquals(true, primeNumberSolution.isPrime(5));
	}

}
