class Solution { 
    // Time Complexity: O(n)
    // Space Complexity: O(n)
    public boolean wordPattern(String pattern, String sentence) {
        String[] words = sentence.split(" ");
        if (pattern.length() != words.length) return false;

        Map<Character, String> charToWord = new HashMap<>();
        Set<String> mappedWords = new HashSet<>();

        for (int i = 0; i < pattern.length(); i++) {
            char c = pattern.charAt(i);
            String word = words[i];

            // If pattern character is new
            if (!charToWord.containsKey(c)) {
                // Word already mapped to another char → invalid pattern
                if (mappedWords.contains(word)) return false;

                charToWord.put(c, word);
                mappedWords.add(word);
            } 
            // Existing mapping must match
            else if (!charToWord.get(c).equals(word)) return false;
        }
        return true; // All mappings are consistent
    }
}
