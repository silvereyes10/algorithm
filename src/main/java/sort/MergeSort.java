package sort;

import enums.SortOrder;
import org.apache.commons.lang3.ArrayUtils;

import java.lang.reflect.Array;

/**
 * Created by silvereyes10 on 2016-12-15.
 */
public class MergeSort<T extends Comparable<T>> implements Sort<T> {
	@Override
	public T[] sort(T[] sourceArray, SortOrder ord) {
		return mergeSort(sourceArray, 0, sourceArray.length, ord);
	}

	private T[] mergeSort(T[] sourceArray, int startIndex, int endIndex, SortOrder ord) {
		if (sourceArray.length <= 1) {
			return sourceArray;
		}
		// sourceArray의 length가 2 이상이면 mergeSort
		int midIndex = (startIndex + endIndex) / 2;
		T[] sourceArray1 = ArrayUtils.subarray(sourceArray, startIndex, midIndex);
		T[] sourceArray2 = ArrayUtils.subarray(sourceArray, midIndex, endIndex);

		sourceArray1 = mergeSort(sourceArray1, 0, sourceArray1.length, ord);
		sourceArray2 = mergeSort(sourceArray2, 0, sourceArray2.length, ord);

		return merge(sourceArray1, sourceArray2, ord);
	}

	private T[] merge(T[] sourceArray1, T[] sourceArray2, SortOrder ord) {
		int arrayLength = sourceArray1.length + sourceArray2.length;

		T[] resultArray = (T[])Array.newInstance(sourceArray1.getClass().getComponentType(), arrayLength);

		int index = 0;
		int source1Index = 0;
		int source2Index = 0;

		while (true) {
			if (source1Index < sourceArray1.length && source2Index < sourceArray2.length) {
				if (compare(sourceArray1[source1Index], sourceArray2[source2Index], ord)) {
					resultArray[index++] = sourceArray1[source1Index++];
				} else {
					resultArray[index++] = sourceArray2[source2Index++];
				}
			} else if (source1Index < sourceArray1.length) {
				resultArray[index++] = sourceArray1[source1Index++];
			} else if (source2Index < sourceArray2.length) {
				resultArray[index++] = sourceArray2[source2Index++];
			} else {
				break;
			}
		}

		return resultArray;
	}

	private boolean compare(T target1, T target2, SortOrder ord) {
		switch (ord) {
			case ASCENDING:
				return target1.compareTo(target2) < 0;
			case DESCENDING:
				return target1.compareTo(target2) > 0;
			default:
				return false;
		}
	}
}
