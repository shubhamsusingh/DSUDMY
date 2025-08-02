package practice.sorting.SlectionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 5, 8, 2, 1, 4, 6, 7, 3 };
        SelectionSort sSort = new SelectionSort();
        sSort.selectionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
