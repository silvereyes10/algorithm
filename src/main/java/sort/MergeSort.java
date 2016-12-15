package sort;

import enums.SortOrder;

/**
 * Created by silvereyes10 on 2016-12-15.
 */
public class MergeSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public T[] sort(T[] sourceArray, SortOrder ord) {
        return;
    }

    private T[] partition(T[] sourceArray, int startIndex, int endIndex) {
        if (startIndex >= endIndex) {
            // sourceArray의 length가 1이면 merge
        }
        // sourceArray의 length가 2 이상이면 partition
        int midIndex = (startIndex + endIndex) / 2;
        T[] mergeArray1 = partition(sourceArray, startIndex, midIndex);
        T[] mergetArray2 = partition(sourceArray, midIndex+1, endIndex);

        return null;
    }

    private T[] merge(T[] sourceArray1, T[] sourceArray2) {
        return null;
    }

    private boolean compare(T target1, T target2, SortOrder ord) {
        switch (ord) {
            case ASCENDING:
                return target1.compareTo(target2) > 0;
            case DESCENDING:
                return target1.compareTo(target2) < 0;
            default:
                return false;
        }
    }
}
