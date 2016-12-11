package sort;

/**
 * @author NAVER
 */
public interface Sort<T> {
	T[] sort(T[] sourceArray, String ord);

	default T[] swap(T[] sourceArray, int targetIndex1, int targetIndex2) {
		T[] copyArray = sourceArray.clone();

		T temp = copyArray[targetIndex1];
		copyArray[targetIndex1] = copyArray[targetIndex2];
		copyArray[targetIndex2] = temp;

		return copyArray;
	}
}
