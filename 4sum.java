import java.util.*;

class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        Arrays.sort(arr);
        List<List<Integer>> res = new ArrayList<>();
        int n = arr.length;

        for (int a = 0; a < n - 3; a++) {
            if (a > 0 && arr[a] == arr[a - 1]) continue;

            for (int b = a + 1; b < n - 2; b++) {
                if (b > a + 1 && arr[b] == arr[b - 1]) continue;

                long t = (long) target - arr[a] - arr[b];
                int l = b + 1, r = n - 1;

                while (l < r) {
                    long sum = arr[l] + arr[r];
                    if (sum == t) {
                        res.add(Arrays.asList(arr[a], arr[b], arr[l], arr[r]));
                        while (l < r && arr[l] == arr[l + 1]) l++;
                        while (l < r && arr[r] == arr[r - 1]) r--;
                        l++; r--;
                    } else if (sum < t) l++;
                    else r--;
                }
            }
        }
        return res;
    }
}
