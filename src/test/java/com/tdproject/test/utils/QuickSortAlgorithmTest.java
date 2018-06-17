/**
 * 
 */
package com.tdproject.test.utils;

import java.util.ArrayList;

import org.junit.Test;

import com.tdproject.utils.QuickSortAlgorithmImpl;

import junit.framework.Assert;

/**
 * @author egilson
 * Tests for the QuickSortAlgorithm.class
 *
 */
public class QuickSortAlgorithmTest {

	/**
	 * Method created to test the sorting algorithm
	 */
	@Test
	public void sortTest() {
		QuickSortAlgorithmImpl quickSort = new QuickSortAlgorithmImpl();
		ArrayList<String> numberList = new ArrayList<>();
		numberList.add("10");
		numberList.add("3");
		numberList.add("6");
		ArrayList<String> result = quickSort.sort(numberList);
		Assert.assertEquals(result.get(0), "3");
		Assert.assertEquals(result.get(1), "6");
		Assert.assertEquals(result.get(2), "10");
	}
	
	/**
	 * Method created to test the sorting algorithm, changing the number positions.
	 */
	@Test
	public void otherPositionSortTest() {
		QuickSortAlgorithmImpl quickSort = new QuickSortAlgorithmImpl();
		ArrayList<String> numberList = new ArrayList<>();
		numberList.add("3");
		numberList.add("6");
		numberList.add("10");
		ArrayList<String> result = quickSort.sort(numberList);
		Assert.assertEquals(result.get(0), "3");
		Assert.assertEquals(result.get(1), "6");
		Assert.assertEquals(result.get(2), "10");
	}
	
	/**
	 * Method created to test the sorting algorithm, changing the number positions
	 */
	@Test
	public void changingNumberPositionTest() {
		QuickSortAlgorithmImpl quickSort = new QuickSortAlgorithmImpl();
		ArrayList<String> numberList = new ArrayList<>();
		numberList.add("6");
		numberList.add("3");
		numberList.add("10");
		ArrayList<String> result = quickSort.sort(numberList);
		Assert.assertEquals(result.get(0), "3");
		Assert.assertEquals(result.get(1), "6");
		Assert.assertEquals(result.get(2), "10");
	}

}
