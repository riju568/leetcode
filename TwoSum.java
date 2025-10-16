import java.util.*;

class Solution {
    public int[] twoSum(int[] arr, int targetValue) {
        // Create a map to store each number and its index
        Map<Integer, Integer> numIndexMap = new HashMap<>();
        
        // Loop through the array
        for (int index = 0; index < arr.length; index++) {
            int currentNum = arr[index];
            int complement = targetValue - currentNum; // The number needed to reach target
            
            // If the complement is already in the map, return the pair of indices
            if (numIndexMap.containsKey(complement))
                return new int[]{numIndexMap.get(complement), index};
            
            // Otherwise, store the current number and its index
            numIndexMap.put(currentNum, index);
        }
        
        // Return empty array if no solution (though problem guarantees one)
        return new int[0];
    }
}
