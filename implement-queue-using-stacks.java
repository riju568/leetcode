class Solution {
    public boolean isPowerOfTwo(int num) {
        // Negative or zero numbers can’t be powers of two
        if (num <= 0) return false;
        // A power of two has exactly one bit set, so n & (n - 1) == 0
        return (num & (num - 1)) == 0;
    }
}
