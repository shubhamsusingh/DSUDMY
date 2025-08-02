package practice.sorting.InsertionSort;

public class InsertionSort {
    public void insertionSort(int[] array) {
        for (int i = 1; i < array.length; i++) {
            int j = i - 1;
            int temp = array[i];
            while (j > -1 && temp < array[j]) {
                array[j + 1] = array[j];
                array[j] = temp;
                j--;
            }
        }
    }
}
