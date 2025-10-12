class Solution {
    public boolean canJump(int[] steps) {
        int lastReachable = steps.length - 1;
        for (int pos = steps.length - 2; pos >= 0; pos--) {
            if (pos + steps[pos] >= lastReachable) {
                lastReachable = pos;
            }
        }
        return lastReachable == 0;
    }
}
