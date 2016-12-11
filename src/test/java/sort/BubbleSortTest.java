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
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
		System.out.println("Init Print Array : ");
		printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, "asc");
		printArray(resultArray);
	}

	@Test
	public void testDescSort() throws Exception {
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
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