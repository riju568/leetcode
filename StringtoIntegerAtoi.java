class Solution {
    public int myAtoi(String str) {
        int idx = 0, sign = 1;
        long val = 0;

        // Skip leading spaces
        while (idx < str.length() && str.charAt(idx) == ' ') idx++;

        // Handle sign
        if (idx < str.length() && (str.charAt(idx) == '+' || str.charAt(idx) == '-'))
            sign = (str.charAt(idx++) == '-') ? -1 : 1;

        // Convert digits
        while (idx < str.length() && Character.isDigit(str.charAt(idx))) {
            int d = str.charAt(idx++) - '0';

            // Overflow check
            if (val > Integer.MAX_VALUE / 10 || (val == Integer.MAX_VALUE / 10 && d > 7))
                return (sign == 1) ? Integer.MAX_VALUE : Integer.MIN_VALUE;

            val = val * 10 + d;
        }

        return (int) (val * sign);
    }
}
