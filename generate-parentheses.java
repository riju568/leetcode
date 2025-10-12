import java.util.*;

class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> result = new ArrayList<>();
        backtrack(result, new StringBuilder(), n, 0, 0);
        return result;
    }

    private void backtrack(List<String> result, StringBuilder cur, int n, int open, int close) {
        // Base case: if the current string has used all parentheses
        if (cur.length() == 2 * n) {
            result.add(cur.toString());
            return;
        }

        // Add '(' if we still have open parentheses available
        if (open < n) {
            cur.append('(');
            backtrack(result, cur, n, open + 1, close);
            cur.setLength(cur.length() - 1); // backtrack
        }

        // Add ')' if there are unmatched '(' to close
        if (close < open) {
            cur.append(')');
            backtrack(result, cur, n, open, close + 1);
            cur.setLength(cur.length() - 1); // backtrack
        }
    }
}
