package practice.HashTable.leetCode.Anagram;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Anagram {
    public List<List<String>> groupAnagram(String[] stringArray) {
        Map<String, List<String>> anagramGroup = new HashMap<>();
        for (String string : stringArray) {
            char[] charArray = string.toCharArray();
            Arrays.sort(charArray);
            String cononial = new String(charArray);
            if (anagramGroup.containsKey(cononial)) {
                anagramGroup.get(cononial).add(string);
            } else {
                List<String> group = new ArrayList<>();
                group.add(string);
                anagramGroup.put(cononial, group);
            }
        }
        return new ArrayList<>(anagramGroup.values());

    }

    public static void main(String[] args) {
        String[] stringArray = { "eat", "tea", "ate", "nat", "bat" };
        Anagram anagram = new Anagram();
        System.out.println(anagram.groupAnagram(stringArray));
    }
}
