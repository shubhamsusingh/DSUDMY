package mergeSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        MergeSortDemo m = new MergeSortDemo();
        int[] array = { 4, 6, 8, 7, 1, 2, 9 };
        int[] sortedArray = m.mergeSort(array);
        System.out.println(Arrays.toString(sortedArray));
    }
}
