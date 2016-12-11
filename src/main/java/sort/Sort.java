package sort;

import org.apache.commons.lang3.StringUtils;

/**
 * @author NAVER
 */
public interface Sort<T extends Comparable> {
	T[] sort(T[] sourceArray, String ord);

	default T[] swap(T[] sourceArray, int targetIndex1, int targetIndex2) {
		T temp = sourceArray[targetIndex1];
		sourceArray[targetIndex1] = sourceArray[targetIndex2];
		sourceArray[targetIndex2] = temp;

		return sourceArray;
	}

	default boolean compare(T target1, T target2, String ord) {
		if (StringUtils.equals(ord, "desc")) {
			return target1.compareTo(target2) < 0;
		} else {
			return target1.compareTo(target2) > 0;
		}
	}
}
