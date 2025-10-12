class Solution {
    public int maxProduct(int[] nums) {
        int max = nums[0], min = nums[0], res = nums[0];
        
        for (int i = 1; i < nums.length; i++) {
            int n = nums[i];
            
            // Swap when negative number flips signs
            if (n < 0) {
                int temp = max;
                max = min;
                min = temp;
            }

            max = Math.max(n, max * n);  // Extend or restart subarray
            min = Math.min(n, min * n);  // Track possible negative min
            res = Math.max(res, max);    // Update result
        }
        
        return res;
    }
}
