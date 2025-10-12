class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;   // total count of numbers expected (0..n)
        int missing = n;       // start from n
        
        // Add index, subtract value — everything cancels except the missing number
        for (int i = 0; i < n; i++)
            missing += i - nums[i];
        
        return missing;         // the missing number
    }
}
