class Solution {
    public boolean validMountainArray(int[] arr) {
        int n = arr.length - 1;
        int i = 0, j = n;

        // Step 1: Walk up the mountain
        while (i + 1 <= n && arr[i] < arr[i + 1]) i++;

        // Step 2: Walk down the mountain
        while (j > 0 && arr[j - 1] > arr[j]) j--;

        // Step 3: Check valid mountain conditions:
        // - Peak not at start (i > 0)
        // - Peak not at end (j < n)
        // - Both pointers meet at the same peak (i == j)
        return i > 0 && j < n && i == j;
    }
}
