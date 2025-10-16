/*
* 7. Reverse Integer
* https://leetcode.com/problems/reverse-integer/description/
*/
class Solution {
    public int reverse(int number) {
        int reversed = 0; // Stores the reversed number

        while (number != 0) {
            int lastDigit = number % 10; // Extract last digit

            // Check for overflow before updating reversed
            if (reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && lastDigit > 7)) return 0;
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && lastDigit < -8)) return 0;

            reversed = reversed * 10 + lastDigit; // Append digit
            number /= 10; // Remove last digit
        }

        return reversed;
    }
}
