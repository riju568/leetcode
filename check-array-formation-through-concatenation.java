class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        Map<Integer, Integer> pos = new HashMap<>();

        // Map first element of each piece to its position
        for (int i = 0; i < pieces.length; i++)
            pos.put(pieces[i][0], i);

        for (int i = 0; i < arr.length; ) {
            if (!pos.containsKey(arr[i])) return false;

            int[] p = pieces[pos.get(arr[i])];
            for (int x : p)
                if (i >= arr.length || arr[i++] != x) return false;
        }
        return true;
    }
}
