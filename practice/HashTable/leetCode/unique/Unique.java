package practice.HashTable.leetCode.unique;

import java.util.HashMap;

public class Unique {
    public int unique(int[] array) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i = 0; i < array.length; i++) {
            hMap.put(array[i], hMap.getOrDefault(array[i], 0) + 1);
        }
        for (int j : hMap.keySet()) {
            System.out.println(j);
            if (hMap.get(j) == 1) {
                System.out.println("This is my Unique value : " + j);
            }
        }
        return 0;
    }
}
