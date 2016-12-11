package sort;

import enums.SortOrder;

/**
 * @author NAVER
 */
public interface Sort<T extends Comparable> {
	T[] sort(T[] sourceArray, SortOrder ord);

	default T[] swap(T[] sourceArray, int targetIndex1, int targetIndex2) {
		T temp = sourceArray[targetIndex1];
		sourceArray[targetIndex1] = sourceArray[targetIndex2];
		sourceArray[targetIndex2] = temp;

		return sourceArray;
	}
}
