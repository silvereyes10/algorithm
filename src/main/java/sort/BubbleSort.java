package sort;

import enums.SortOrder;

/**
 * @author NAVER
 */
public class BubbleSort implements Sort<Integer> {
	@Override
	public Integer[] sort(Integer[] sourceArray, SortOrder ord) {
		Integer[] copyArray = sourceArray.clone();

		for(int count = 1; count < copyArray.length; count++) {
			for (int index = 0; index < copyArray.length - count; index++) {
				if (compare(copyArray[index], copyArray[index + 1], ord)) {
					copyArray = swap(copyArray, index, index + 1);
				}
			}
		}
		return copyArray;
	}


	private <T extends Comparable<T>> boolean compare(T target1, T target2, SortOrder ord) {
		switch(ord) {
			case ASCENDING: return target1.compareTo(target2) > 0;
			case DESCENDING: return  target1.compareTo(target2) < 0;
			default: return false;
		}
	}
}
