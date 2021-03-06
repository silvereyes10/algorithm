/*
 * @(#)BubbleSortTest.java  2016.12.11
 *
 * Copyright 2016 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sort;

import org.junit.Test;

import enums.SortOrder;
import utils.ArrayGenerator;

/**
 *
 * @author NAVER
 */
public class BubbleSortTest {
	private BubbleSort<Integer> bubbleSort = new BubbleSort<>();

	@Test
	public void ascSort() throws Exception {
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
		System.out.println("Ascending Init Print Array : ");
		ArrayGenerator.printArray(intArray);

		System.out.println("Ascending Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray, SortOrder.ASCENDING);
		ArrayGenerator.printArray(resultArray);
	}

	@Test
	public void descSort() throws Exception {
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
		System.out.println("Decending Init Print Array : ");
		ArrayGenerator.printArray(intArray);

		System.out.println("Decending Result Print Array : ");
		Integer[] resultArray = bubbleSort.sort(intArray,  SortOrder.DESCENDING);
		ArrayGenerator.printArray(resultArray);
	}
}