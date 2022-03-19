/**
 * 
 */
package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.ReverseStringSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class ReverseStringSolutionTest {

	@Test
	void testReverseString() {
		ReverseStringSolution reverseStringSolution = new ReverseStringSolution();
		assertEquals("Rohitdutt", reverseStringSolution.reverseString("ttudtihoR"));
		assertEquals("enobes", reverseStringSolution.reverseString("sebone"));
	}

}
