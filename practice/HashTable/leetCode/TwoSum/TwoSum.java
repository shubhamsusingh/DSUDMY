package practice.HashTable.leetCode.TwoSum;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSum {
    public int[] twoSum(int[] arr, int target) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            int diff = target - num;
            if (hMap.containsKey(diff)) {
                return new int[] { hMap.get(diff), i };
            }
            hMap.put(arr[i], i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        TwoSum tSum = new TwoSum();
        int[] array = { 1, 2, 3, 4, 5 };
        System.out.println(Arrays.toString(tSum.twoSum(array, 5)));
    }
}
