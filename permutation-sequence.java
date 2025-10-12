import java.util.*;

class Solution {
    public String getPermutation(int n, int k) {
        int[] fact = new int[n + 1];
        fact[0] = 1;
        for (int i = 1; i <= n; i++) fact[i] = fact[i - 1] * i;

        List<Integer> nums = new ArrayList<>();
        for (int i = 1; i <= n; i++) nums.add(i);

        k--;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= n; i++) {
            int idx = k / fact[n - i];
            sb.append(nums.get(idx));
            nums.remove(idx);
            k %= fact[n - i];
        }
        return sb.toString();
    }
}
