class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        if (n == 0) return arr;

        // Use TreeSet for automatic sorting
        Set<Integer> set = new TreeSet<>();
        for (int a : arr) set.add(a);

        // Assign ranks
        Map<Integer, Integer> rankMap = new HashMap<>();
        int rank = 1;
        for (int val : set) rankMap.put(val, rank++);

        // Build result
        int[] res = new int[n];
        for (int i = 0; i < n; i++) res[i] = rankMap.get(arr[i]);

        return res;
    }
}
