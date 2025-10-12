import java.util.*;

class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> result = new ArrayList<>();
        backtrack(result, new ArrayList<>(), candidates, target, 0);
        return result;
    }

    private void backtrack(List<List<Integer>> res, List<Integer> combo, int[] cand, int remain, int start) {
        if (remain == 0) {
            res.add(new ArrayList<>(combo));
            return;
        }

        for (int i = start; i < cand.length && cand[i] <= remain; i++) {
            combo.add(cand[i]);
            backtrack(res, combo, cand, remain - cand[i], i);
            combo.remove(combo.size() - 1);
        }
    }
}
