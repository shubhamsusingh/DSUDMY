package practice.HashTable.leetCode.SubArraySum;

import java.util.Arrays;
import java.util.HashMap;

public class SubArraySum {
    public int[] subArraySum(int[] array, int target) {
        HashMap<Integer, Integer> sumIndex = new HashMap<>();
        int currentSum = 0;
        for (int i = 0; i < array.length; i++) {
            currentSum += array[i];
            if (sumIndex.containsKey(currentSum - target)) {
                return new int[] { sumIndex.get(currentSum - target) + 1, i };
            }
            sumIndex.put(currentSum, i);
        }
        return new int[] {};
    }

    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 5 };
        int target = 9;
        SubArraySum sum = new SubArraySum();
        int[] result = sum.subArraySum(array, target);
        System.out.println(Arrays.toString(result));
    }
}
