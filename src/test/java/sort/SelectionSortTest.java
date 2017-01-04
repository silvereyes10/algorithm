package sort;

import enums.SortOrder;
import org.junit.Test;
import utils.ArrayGenerator;

/**
 * Created by silvereyes10 on 2016-12-15.
 */
public class SelectionSortTest {
    private SelectionSort<Integer> selectionSort = new SelectionSort<>();

    @Test
    public void ascSort() throws Exception {
        Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
        System.out.println("Ascending Init Print Array : ");
        ArrayGenerator.printArray(intArray);

        System.out.println("Ascending Result Print Array : ");
        Integer[] resultArray = selectionSort.sort(intArray, SortOrder.ASCENDING);
        ArrayGenerator.printArray(resultArray);
    }

    @Test
    public void descSort() throws Exception {
        Integer[] intArray = ArrayGenerator.getRandomIntegerArray();
        System.out.println("Descending Init Print Array : ");
        ArrayGenerator.printArray(intArray);

        System.out.println("Descending Result Print Array : ");
        Integer[] resultArray = selectionSort.sort(intArray, SortOrder.DESCENDING);
        ArrayGenerator.printArray(resultArray);
    }
}