package sort;

/**
 * @author NAVER
 */
public class BubbleSort implements Sort<Integer> {
	@Override
	public Integer[] sort(Integer[] sourceArray, String ord) {
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
}
