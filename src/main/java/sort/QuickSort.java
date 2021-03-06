package sort;

import enums.SortOrder;

/**
 * @author NAVER
 */
public class QuickSort<T extends Comparable<T>> implements Sort<T> {
	@Override
	public T[] sort(T[] sourceArray, SortOrder ord) {
		T[] copyArray = sourceArray.clone();

		return quickSort(copyArray, 0, copyArray.length - 1, ord);
	}

	private T[] quickSort(T[] copyArray, int startIndex, int endIndex, SortOrder ord) {
		if (startIndex < endIndex) {
			int pivot = partition(copyArray, startIndex, endIndex, ord);
			quickSort(copyArray, startIndex, pivot-1, ord);
			quickSort(copyArray, pivot + 1, endIndex, ord);
		}

		return copyArray;
	}

	private int partition(T[] copyArray, int startIndex, int endIndex, SortOrder ord) {
		int pivot = endIndex;
		int wall = startIndex;
		int left = startIndex;

		boolean compareResult;

		while (left < pivot) {
			compareResult = compare(copyArray[left], copyArray[pivot], ord);
			if (compareResult) {
				swap(copyArray, wall, left);
				wall++;
			}
			left++;
		}
		swap(copyArray, wall, pivot);
		return wall;
	}

	private boolean compare(T target1, T target2, SortOrder ord) {
		switch(ord) {
			case ASCENDING: return target1.compareTo(target2) < 0;
			case DESCENDING: return  target1.compareTo(target2) > 0;
			default: return false;
		}
	}
}
