/*
* 4 . Median of Two Sorted Arrays
* https://leetcode.com/problems/median-of-two-sorted-arrays/description/?filters=tag%3AJava
*/
class Solution {
    public double findMedianSortedArrays(int[] arr1, int[] arr2) {
        // Ensure arr1 is smaller
        if (arr1.length > arr2.length) { int[] tmp = arr1; arr1 = arr2; arr2 = tmp; }

        int len1 = arr1.length, len2 = arr2.length;
        int low = 0, high = len1, half = (len1 + len2 + 1) / 2;

        while (low <= high) {
            int cut1 = (low + high) / 2;
            int cut2 = half - cut1;

            if (cut1 < len1 && arr2[cut2 - 1] > arr1[cut1]) low = cut1 + 1;
            else if (cut1 > 0 && arr1[cut1 - 1] > arr2[cut2]) high = cut1 - 1;
            else {
                int leftMax = (cut1 == 0) ? arr2[cut2 - 1] : (cut2 == 0 ? arr1[cut1 - 1] : Math.max(arr1[cut1 - 1], arr2[cut2 - 1]));
                if ((len1 + len2) % 2 == 1) return leftMax;

                int rightMin = (cut1 == len1) ? arr2[cut2] : (cut2 == len2 ? arr1[cut1] : Math.min(arr1[cut1], arr2[cut2]));
                return (leftMax + rightMin) / 2.0;
            }
        }
        return 0.0;
    }
}
