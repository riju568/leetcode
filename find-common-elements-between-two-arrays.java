class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        Set<Integer> a = new HashSet<>(), b = new HashSet<>();
        for (int x : nums1) a.add(x);
        for (int x : nums2) b.add(x);
        int c1 = 0, c2 = 0;
        for (int x : nums1) if (b.contains(x)) c1++;
        for (int x : nums2) if (a.contains(x)) c2++;
        return new int[]{c1, c2};
    }
}
