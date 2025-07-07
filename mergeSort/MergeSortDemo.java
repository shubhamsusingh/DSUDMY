package mergeSort;

import java.util.Arrays;

public class MergeSortDemo {
    public int[] mergeSort(int[] array) {
        if (array.length <= 1)
            return array;
        int minIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, minIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, minIndex, array.length));
        return merge(left, right);
    }

    private int[] merge(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index] = arr1[i];
                index++;
                i++;
            } else {
                combined[index] = arr2[j];
                index++;
                j++;
            }
        }
        while (i < arr1.length) {
            combined[index] = arr1[i];
            index++;
            i++;
        }
        while (j < arr2.length) {
            combined[index] = arr2[j];
            index++;
            j++;
        }
        return combined;
    }
}
