class Solution {
    public void rotate(int[][] mat) {
        int n = mat.length;

        // Transpose the matrix
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Reverse each row
        for (int[] row : mat) {
            for (int l = 0, r = n - 1; l < r; l++, r--) {
                int temp = row[l];
                row[l] = row[r];
                row[r] = temp;
            }
        }
    }
}
