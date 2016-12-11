/*
 * @(#)QuickSortTest.java  2016.12.11
 *
 * Copyright 2016 NHN Corp. All rights Reserved. 
 * NHN PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package sort;

import org.junit.Test;

import sort.utils.ArrayGenerator;

/**
 *
 * @author NAVER
 */
public class QuickSortTest {
	private QuickSort quickSort = new QuickSort();

	@Test
	public void ascSort() throws Exception {
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
		System.out.println("Init Print Array : ");
		ArrayGenerator.printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = quickSort.sort(intArray, "asc");
		ArrayGenerator.printArray(resultArray);
	}

	@Test
	public void descSort() throws Exception {
		Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
		System.out.println("Init Print Array : ");
		ArrayGenerator.printArray(intArray);

		System.out.println("Result Print Array : ");
		Integer[] resultArray = quickSort.sort(intArray, "desc");
		ArrayGenerator.printArray(resultArray);
	}
}