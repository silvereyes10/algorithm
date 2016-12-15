package sort;

import enums.SortOrder;

/**
 * Created by silvereyes10 on 2016-12-15.
 */
public class SelectionSort<T extends Comparable<T>> implements Sort<T> {
    @Override
    public T[] sort(T[] sourceArray, SortOrder ord) {
        for (int i = 0; i < sourceArray.length; i++) {
            int valueIndex = i;
            for (int index = i; index < sourceArray.length; index++) {
                if (compare(sourceArray[valueIndex], sourceArray[index], ord)) {
                    valueIndex = index;
                }
            }
            swap(sourceArray, valueIndex, i);
        }

        return sourceArray;
    }

    private boolean compare(T target1, T target2, SortOrder ord) {
        switch(ord) {
            case ASCENDING: return target1.compareTo(target2) > 0;
            case DESCENDING: return  target1.compareTo(target2) < 0;
            default: return false;
        }
    }
}
