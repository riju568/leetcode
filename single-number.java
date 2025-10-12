class Solution {
    public int singleNumber(int[] numbers) {
        int unique = 0;
        for (int num : numbers) {
            unique ^= num;  // XOR cancels out duplicate numbers
        }
        return unique;
    }
}
