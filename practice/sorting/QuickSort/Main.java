package practice.sorting.QuickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 12, 5, 1, 10 };
        QuickSort qs = new QuickSort();
        System.out.println("Original Array : ");
        System.out.println(Arrays.toString(arr));
        qs.quickSort(arr);
        System.out.println("After sorting : ");
        System.out.println(Arrays.toString(arr));
    }
}
