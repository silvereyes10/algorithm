/*
 * @(#)BubbleSortTest.java  2016.12.11
 *
 * Copyright 2016 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sort;

import org.junit.Test;

/**
 *
 * @author NAVER
 */
public class BubbleSortTest {
	private BubbleSort bubbleSort = new BubbleSort();

	@Test
	public void testAscSort() throws Exception {
		Integer[] intArray = {9, 8, 7, 6, 5, 4, 3, 2, 1};
		System.out.println("Init Print Array : ");
		printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, "asc");

		printArray(resultArray);
	}

	@Test
	public void testAscSort_randomArray() throws Exception {
		Integer[] intArray = {4, 6, 3, 8, 2, 5, 1, 7, 7};
		System.out.println("Init Print Array : ");
		printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, "asc");

		printArray(resultArray);
	}

	@Test
	public void testDescSort() throws Exception {
		Integer[] intArray = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		System.out.println("Init Print Array : ");
		printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, "desc");

		printArray(resultArray);
	}

	@Test
	public void testDescSort_randomArray() throws Exception {
		Integer[] intArray = {4, 6, 3, 8, 2, 5, 1, 7, 7};
		System.out.println("Init Print Array : ");
		printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, "desc");

		printArray(resultArray);
	}

	private <T> void printArray(T[] targetArray) {
		for (int i = 0; i < targetArray.length; i++) {
			System.out.print(targetArray[i] + " ");
		}
		System.out.print("\n\n");
	}
}