class Solution {
    public boolean isAnagram(String s, String t) {
        // If lengths differ, they can’t be anagrams
        if (s.length() != t.length()) return false;

        // Frequency map for character counts
        Map<Character, Integer> countMap = new HashMap<>();

        // Count characters from the first string
        for (char c : s.toCharArray())
            countMap.put(c, countMap.getOrDefault(c, 0) + 1);

        // Decrease counts based on the second string
        for (char c : t.toCharArray()) {
            if (!countMap.containsKey(c) || countMap.get(c) == 0) return false;
            countMap.put(c, countMap.get(c) - 1);
        }

        // If all counts match, it's an anagram
        return true;
    }
}
