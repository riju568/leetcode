class Solution {
    public int minOperations(int[] a, int[] b) {
        if (a.length < b.length) return minOperations(b, a);
        if (a.length > b.length * 6) return -1;
        int[] ca = new int[7], cb = new int[7]; int sa = 0, sb = 0;
        for (int x : a) { ca[x]++; sa += x; }
        for (int x : b) { cb[x]++; sb += x; }
        return sa > sb ? bal(ca, cb, sa - sb) : bal(cb, ca, sb - sa);
    }
    private int bal(int[] ca, int[] cb, int diff) {
        int[] c = new int[6]; int ops = 0;
        for (int i = 1; i <= 6; i++) { c[6 - i] += ca[i]; c[i - 1] += cb[i]; }
        for (int i = 5; i >= 0 && diff > 0; i--) {
            int use = Math.min(c[i], (diff + i) / (i + 1));
            diff -= use * (i + 1); ops += use;
        }
        return diff > 0 ? -1 : ops;
    }
}
