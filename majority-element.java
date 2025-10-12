import java.util.Arrays;

class Solution {
    public int majorityElement(int[] numsArray) {
        Arrays.sort(numsArray);
        return numsArray[numsArray.length / 2];
    }
}
