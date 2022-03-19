package com.rohitdutt.day1.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

import com.rohitdutt.day1.FibonacciSeriesSolution;

/**
 * @author Rohitdutt Parsai
 * 18/03/2022
 */
class FibonacciSeriesSolutionTest {

	@Test
	void fibonacciSeriesUptoNTest() {
		FibonacciSeriesSolution fibonacciSeriesSolution = new FibonacciSeriesSolution();
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(1);
		list.add(2);
		list.add(3);
		assertEquals(list, fibonacciSeriesSolution.fibonacciSeriesUptoN(5));
	}

}
