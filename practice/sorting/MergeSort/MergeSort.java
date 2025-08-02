package practice.sorting.MergeSort;

import java.util.Arrays;

public class MergeSort {
    public int[] mergeSort(int[] array) {
        if (array.length == 1) {
            return array;
        }
        int midIndex = array.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(array, 0, midIndex));
        int[] right = mergeSort(Arrays.copyOfRange(array, midIndex, array.length));
        return merge(left, right);

    }

    public int[] merge(int[] arr1, int[] arr2) {
        int[] combined = new int[arr1.length + arr2.length];
        int index = 0;
        int i = 0;
        int j = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                combined[index++] = arr1[i++];

            } else {
                combined[index++] = arr2[j++];
            }
        }
        while (i < arr1.length) {
            combined[index++] = arr1[i++];
        }
        while (j < arr2.length) {
            combined[index++] = arr2[j++];
        }
        return combined;
    }
}
