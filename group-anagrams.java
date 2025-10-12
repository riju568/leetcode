import java.util.*;

class Solution {
    public List<List<String>> groupAnagrams(String[] words) {
        Map<String, List<String>> map = new HashMap<>();
        for (String w : words) {
            char[] arr = w.toCharArray();
            Arrays.sort(arr);
            String key = new String(arr);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(w);
        }
        return new ArrayList<>(map.values());
    }
}
