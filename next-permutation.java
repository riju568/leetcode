class Solution {
    public void nextPermutation(int[] nums) {
        int n = nums.length, pivot = -1;
        
        // 1️⃣ Find pivot — first decreasing element from the right
        for (int i = n - 2; i >= 0; i--) {
            if (nums[i] < nums[i + 1]) {
                pivot = i;
                break;
            }
        }

        // 2️⃣ If no pivot found, reverse entire array (last permutation → first)
        if (pivot == -1) {
            reverse(nums, 0, n - 1);
            return;
        }

        // 3️⃣ Find rightmost element greater than pivot, then swap
        for (int i = n - 1; i > pivot; i--) {
            if (nums[i] > nums[pivot]) {
                swap(nums, i, pivot);
                break;
            }
        }

        // 4️⃣ Reverse suffix to make it smallest possible
        reverse(nums, pivot + 1, n - 1);
    }

    private void swap(int[] nums, int i, int j) {
        int tmp = nums[i];
        nums[i] = nums[j];
        nums[j] = tmp;
    }

    private void reverse(int[] nums, int l, int r) {
        while (l < r) swap(nums, l++, r--);
    }
}
