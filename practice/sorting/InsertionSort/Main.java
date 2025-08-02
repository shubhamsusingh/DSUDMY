package practice.sorting.InsertionSort;

public class Main {
    public static void main(String[] args) {
        int[] arr = { 4, 5, 2, 1, 9, 7, 6 };
        InsertionSort Isort = new InsertionSort();
        Isort.insertionSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
