package practice.HashTable.leetCode.FirstNonRepeating;

import java.util.HashMap;

public class FIrstNonRepeating {
    public Character firstRepeating(String s) {
        HashMap<Character, Integer> hMap = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hMap.put(s.charAt(i), hMap.getOrDefault(s.charAt(i), 0) + 1);
        }
        for (int i = 0; i < s.length(); i++) {
            if (hMap.get(s.charAt(i)) == 1) {
                return s.charAt(i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FIrstNonRepeating fs = new FIrstNonRepeating();
        String name = "shubham";
        System.out.println(fs.firstRepeating(name));
    }
}
