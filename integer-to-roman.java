class Solution {
    private static final int[] nums = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
    private static final String[] romans = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

    public String intToRoman(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nums.length && n > 0; i++) {
            while (n >= nums[i]) {
                sb.append(romans[i]);
                n -= nums[i];
            }
        }
        return sb.toString();
    }
}
