/*
* 5. Longest Palindrome Substring
* https://leetcode.com/problems/longest-palindromic-substring/description/?filters=tag%3AJava
*/

class Solution {
    public String longestPalindrome(String str) {
        if (str.length() < 2) return str;
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            String s1 = expand(str, i, i);
            String s2 = expand(str, i, i + 1);
            String cur = s1.length() > s2.length() ? s1 : s2;
            if (cur.length() > ans.length()) ans = cur;
        }
        return ans;
    }

    private String expand(String s, int l, int r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--; r++;
        }
        return s.substring(l + 1, r);
    }
}
