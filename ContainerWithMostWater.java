class Solution {
    public int maxArea(int[] h) {
        int l = 0, r = h.length - 1, res = 0;
        
        while (l < r) {
            int height = Math.min(h[l], h[r]);
            res = Math.max(res, height * (r - l));
            if (h[l] < h[r]) l++;
            else r--;
        }
        
        return res;
    }
}
