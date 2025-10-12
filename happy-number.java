class Solution {
    public boolean isHappy(int number) {
        int original = number;
        do {
            int digit, total = 0;
            while (number > 0) {
                digit = number % 10;
                total += digit * digit;
                number /= 10;
            }
            number = total;
        } while (number > 6 && number != original);
        return number == 1;
    }
}
