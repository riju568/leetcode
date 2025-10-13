class Solution {
    public List<Integer> targetIndices(int[] nums, int target) {
        int less = 0, count = 0;
        for (int n : nums) {
            if (n < target) less++;
            else if (n == target) count++;
        }
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < count; i++) res.add(less + i);
        return res;
    }
}
