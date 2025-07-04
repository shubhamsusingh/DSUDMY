package sorting;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 7, 1, 5, 2 };
        BubbleSort b = new BubbleSort();
        b.bubbleShort(arr);
        System.out.println(Arrays.toString(arr));
        int[] selectArray = { 5, 1, 6, 2, 4, 3 };
        b.selectionSort(selectArray);
        System.out.println(Arrays.toString(selectArray));
        int[] insertArray = { 5, 2, 6, 4, 3, 1 };
        b.InsertionSort(insertArray);
        System.out.println(Arrays.toString(insertArray));
    }

}
