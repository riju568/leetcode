import java.util.*;

class Solution {
    public int[][] insert(int[][] A, int[] B) {
        List<int[]> res = new ArrayList<>();
        int i = 0, n = A.length;
        while (i < n && A[i][1] < B[0]) res.add(A[i++]);
        while (i < n && A[i][0] <= B[1]) {
            B[0] = Math.min(B[0], A[i][0]);
            B[1] = Math.max(B[1], A[i][1]);
            i++;
        }
        res.add(B);
        while (i < n) res.add(A[i++]);
        return res.toArray(new int[res.size()][]);
    }
}
