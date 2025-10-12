import java.util.*;

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        boolean[] seen = new boolean[nums.length];
        backtrack(res, new ArrayList<>(), nums, seen);
        return res;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> path, int[] nums, boolean[] seen) {
        if (path.size() == nums.length) {
            res.add(new ArrayList<>(path));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (seen[i]) continue;
            path.add(nums[i]);
            seen[i] = true;

            backtrack(res, path, nums, seen);

            seen[i] = false;
            path.remove(path.size() - 1);
        }
    }
}
