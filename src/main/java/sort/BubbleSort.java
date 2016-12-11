package sort;

import org.apache.commons.lang3.StringUtils;

/**
 * @author NAVER
 */
public class BubbleSort implements Sort<Integer> {
	@Override
	public Integer[] sort(Integer[] sourceArray, String ord) {
		Integer[] copyArray = sourceArray.clone();

		if (StringUtils.equals(ord, "asc")) {
			return ascSort(copyArray);
		} else if (StringUtils.equals(ord, "desc")) {
			return descSort(copyArray);
		}
		return copyArray;
	}

	private Integer[] ascSort(Integer[] copyArray) {
		for(int count = 1; count < copyArray.length; count++) {
			for (int index = 0; index < copyArray.length - count; index++) {
				if (copyArray[index].compareTo(copyArray[index + 1]) > 0) {
					Integer[] swapArray = swap(copyArray, index, index + 1);
					copyArray = swapArray;
				}
			}
		}
		return copyArray;
	}

	private Integer[] descSort(Integer[] copyArray) {
		for(int count = 1; count < copyArray.length; count++) {
			for (int index = 0; index < copyArray.length - count; index++) {
				if (copyArray[index].compareTo(copyArray[index + 1]) < 0) {
					Integer[] swapArray = swap(copyArray, index, index + 1);
					copyArray = swapArray;
				}
			}
		}
		return copyArray;
	}
}
