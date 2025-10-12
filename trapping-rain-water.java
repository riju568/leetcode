class Solution {
    public int trap(int[] h) {
        int l = 0, r = h.length - 1, lMax = 0, rMax = 0, water = 0;
        while (l < r) {
            lMax = Math.max(lMax, h[l]);
            rMax = Math.max(rMax, h[r]);
            if (lMax < rMax) water += lMax - h[l++];
            else water += rMax - h[r--];
        }
        return water;
    }
}
