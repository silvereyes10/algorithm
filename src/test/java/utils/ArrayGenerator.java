package utils;

import java.util.Random;

/**
 * @author NAVER
 */
public class ArrayGenerator {
	private static int MAX_ARRAY_LENGTH = 10;
	private static int INTEGER_BOUNT = 100;

	public static Integer[] getRandomIntegerArray() {
		Random random = new Random();

		Integer[] integerArray = new Integer[MAX_ARRAY_LENGTH];
		for (int i=0; i<MAX_ARRAY_LENGTH; i++){
			integerArray[i] = random.nextInt(INTEGER_BOUNT);
		}

		return integerArray;
	}

	public static <T> void printArray(T[] targetArray) {
		for (int i = 0; i < targetArray.length; i++) {
			System.out.print(targetArray[i] + " ");
		}
		System.out.print("\n\n");
	}
}
