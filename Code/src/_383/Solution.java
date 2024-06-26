package _383;

import java.util.HashMap;

public class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : magazine.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        for (char c : ransomNote.toCharArray()) {
            if (!map.containsKey(c)) {
                return false;
            }else {
                map.put(c,map.getOrDefault(c,0) - 1);
                if (map.get(c) < 0) {
                    return false;
                }
            }
        }
        return true;
    }
}
