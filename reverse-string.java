class Solution {
    public void reverseString(char[] s) {
        int l = 0, r = s.length - 1; // two pointers
        while (l < r) {
            char tmp = s[l];
            s[l++] = s[r];
            s[r--] = tmp;
        }
    }
}
