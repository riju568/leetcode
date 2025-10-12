class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first = find(nums, target, true);
        if (first == -1) return new int[]{-1, -1};
        int last = find(nums, target, false);
        return new int[]{first, last};
    }

    private int find(int[] nums, int target, boolean findFirst) {
        int res = -1, l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
            if (nums[m] == target) {
                res = m;
                if (findFirst) r = m - 1;
                else l = m + 1;
            } else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }
        return res;
    }
}
