class Solution {
    public int titleToNumber(String s) {
        int num = 0;
        for (char ch : s.toCharArray())
            num = num * 26 + (ch - 'A' + 1);
        return num;
    }
}
