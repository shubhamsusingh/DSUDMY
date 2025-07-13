package quickSort;

public class QuickSortDemo {
    private void swap(int[] array, int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    private int pivot(int[] array, int pivotIndex, int endIndex) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i <= endIndex; i++) {
            if (array[i] < array[pivotIndex]) {
                swapIndex++;
                swap(array, swapIndex, i);
            }
        }
        swap(array, pivotIndex, swapIndex);
        return swapIndex;

    }

    public void quickSortDemo(int[] array, int left, int endIndex) {
        int pivot = pivot(array, left, endIndex);
        if (left < endIndex) {
            quickSortDemo(array, left, pivot - 1);
            quickSortDemo(array, pivot + 1, endIndex);

        }
    }
}
