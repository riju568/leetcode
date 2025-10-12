class Solution {
    public int[] sortedSquares(int[] nums) {
        int n = nums.length, l = 0, r = n - 1, p = n - 1, res[] = new int[n];
        while (l <= r)
            res[p--] = Math.abs(nums[l]) > Math.abs(nums[r]) ? nums[l]*nums[l++] : nums[r]*nums[r--];
        return res;
    }
}
