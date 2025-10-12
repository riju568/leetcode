class Solution {
    public void moveZeroes(int[] nums) {
        int insertPos = 0; // Tracks position to place next non-zero element

        // Step 1: Shift all non-zero elements to the front
        for (int num : nums) {
            if (num != 0)
                nums[insertPos++] = num;
        }

        // Step 2: Fill remaining positions with zeros
        while (insertPos < nums.length)
            nums[insertPos++] = 0;
    }
}
