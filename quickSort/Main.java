package quickSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        QuickSortDemo qs = new QuickSortDemo();
        int[] array = { 5, 2, 6, 7, 9, 1, 3, 4 };
        qs.quickSortDemo(array, 0, array.length - 1);
        System.out.println(Arrays.toString(array));
    }
}
