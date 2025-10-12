import java.util.*;

class Solution {
    private List<List<Integer>> res;

    public List<List<Integer>> combinationSum2(int[] nums, int target) {
        res = new ArrayList<>();
        Arrays.sort(nums);
        dfs(nums, target, 0, new ArrayList<>());
        return res;
    }

    private void dfs(int[] nums, int remain, int start, List<Integer> path) {
        if (remain == 0) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = start; i < nums.length && nums[i] <= remain; i++) {
            if (i > start && nums[i] == nums[i - 1]) continue;

            path.add(nums[i]);
            dfs(nums, remain - nums[i], i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
