import java.util.*;

class Solution {
    public int romanToInt(String str) {
        Map<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        int res = 0, prev = 0;
        for (int i = str.length() - 1; i >= 0; i--) {
            int val = map.get(str.charAt(i));
            res += (val < prev) ? -val : val;
            prev = val;
        }
        return res;
    }
}
