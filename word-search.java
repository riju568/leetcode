class Solution {
    public boolean exist(char[][] board, String word) {
        int m = board.length, n = board[0].length;
        for (int i = 0; i < m; i++)
            for (int j = 0; j < n; j++)
                if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0))
                    return true;
        return false;
    }

    private boolean dfs(char[][] b, String w, int i, int j, int k) {
        if (k == w.length()) return true;
        if (i < 0 || i >= b.length || j < 0 || j >= b[0].length || b[i][j] != w.charAt(k))
            return false;

        char temp = b[i][j];
        b[i][j] = '#'; // mark visited
        boolean found = dfs(b, w, i + 1, j, k + 1) ||
                        dfs(b, w, i - 1, j, k + 1) ||
                        dfs(b, w, i, j + 1, k + 1) ||
                        dfs(b, w, i, j - 1, k + 1);
        b[i][j] = temp; // unmark
        return found;
    }
}
