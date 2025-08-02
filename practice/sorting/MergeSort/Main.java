package practice.sorting.MergeSort;

public class Main {
    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        int[] arr = { 7, 8, 1, 9, 4, 2, 3, 5, 6 };
        int[] mergedArray = ms.mergeSort(arr);
        for (int i = 0; i < mergedArray.length; i++) {
            System.out.println(mergedArray[i]);
        }
    }
}
