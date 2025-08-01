package practice.sorting.BubbleSort;

public class Main {
    public static void main(String[] args) {
        BubbleSort bSort = new BubbleSort();
        int[] array = { 4, 6, 2, 9, 7 };
        bSort.bubbleSort(array);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
