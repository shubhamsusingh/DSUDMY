package practice.HashTable.leetCode.IteamCommon;

import java.util.HashMap;

public class IteamCommon {
    public boolean checkCommon(int[] array1, int[] array2) {
        HashMap<Integer, Boolean> hMap = new HashMap<>();
        for (int i : array1) {
            hMap.put(i, true);
        }
        for (int j : array2) {
            if (hMap.get(j) != null) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        IteamCommon itm = new IteamCommon();
        int[] arr1 = { 1, 3, 4, 5 };
        int[] arr2 = { 2, 3, 8, 9 };
        System.out.println(itm.checkCommon(arr1, arr2));
    }
}
