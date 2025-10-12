import java.util.*;

class Solution {
    public int threeSumClosest(int[] arr, int target) {
        Arrays.sort(arr);
        int n = arr.length;
        int best = arr[0] + arr[1] + arr[2];

        for (int i = 0; i < n - 2; i++) {
            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (Math.abs(sum - target) < Math.abs(best - target))
                    best = sum;
                if (sum == target) return sum;
                if (sum < target) l++;
                else r--;
            }
        }
        return best;
    }
}
