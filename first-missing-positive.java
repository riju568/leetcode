class Solution {
    public int firstMissingPositive(int[] nums) {
        int n = nums.length;

        // Step 1: Replace all invalid numbers with a placeholder (n+1)
        for (int i = 0; i < n; i++) {
            if (nums[i] <= 0 || nums[i] > n)
                nums[i] = n + 1;
        }

        // Step 2: Mark the presence of numbers in range [1, n]
        for (int i = 0; i < n; i++) {
            int val = Math.abs(nums[i]);
            if (val <= n && nums[val - 1] > 0)
                nums[val - 1] = -nums[val - 1];
        }

        // Step 3: Find the first positive index
        for (int i = 0; i < n; i++) {
            if (nums[i] > 0)
                return i + 1;
        }

        // Step 4: If all numbers [1..n] are present
        return n + 1;
    }
}
