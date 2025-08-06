package practice.HashTable.leetCode.FindDuplicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class FindDuplicates {
    public ArrayList<Integer> findDuplicates(int[] array) {
        HashMap<Integer, Integer> hMap = new HashMap<>();
        for (int i : array) {
            hMap.put(i, hMap.getOrDefault(i, 0) + 1);
        }
        ArrayList<Integer> result = new ArrayList<>();
        // for (Map.Entry<Integer, Integer> entry : hMap.entrySet()) {
        // if (entry.getValue() > 1) {
        // result.add(entry.getKey());
        // }
        // }
        for (int i : hMap.keySet()) {
            if (hMap.get(i) > 1) {
                result.add(i);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindDuplicates find = new FindDuplicates();
        int[] array = { 1, 2, 3, 3, 4, 5, 2, 7 };
        ArrayList<Integer> result = find.findDuplicates(array);
        System.out.println(result);
    }
}
