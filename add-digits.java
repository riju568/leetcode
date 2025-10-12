class Solution {
    public int addDigits(int num) {
        // Repeat until only one digit remains
        while (num > 9) {
            int sum = 0;
            for (int n = num; n > 0; n /= 10)
                sum += n % 10; // Add each digit
            num = sum;
        }
        return num;
    }
}
