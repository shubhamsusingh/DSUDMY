package practice.sorting.QuickSort;

public class QuickSort {
    private void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
        return;
    }

    private int pivot(int[] arr, int pivotIndex, int end) {
        int swapIndex = pivotIndex;
        for (int i = pivotIndex + 1; i < arr.length - 1; i++) {
            if (arr[i] < arr[pivotIndex]) {
                swapIndex++;
                swap(arr, i, swapIndex);
            }

        }
        swap(arr, pivotIndex, swapIndex);
        return swapIndex;
    }

    private void quickSortHelper(int[] arr, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = pivot(arr, startIndex, endIndex);
            quickSortHelper(arr, startIndex, pivotIndex - 1);
            quickSortHelper(arr, pivotIndex + 1, endIndex);
        }
    }

    public void quickSort(int[] arr) {
        quickSortHelper(arr, 0, arr.length - 1);
    }
}
