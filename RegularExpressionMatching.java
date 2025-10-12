enum State { TRUE, FALSE }

class Solution {
    State[][] cache;

    public boolean isMatch(String text, String pattern) {
        cache = new State[text.length() + 1][pattern.length() + 1];
        return dfs(0, 0, text, pattern);
    }

    private boolean dfs(int tIdx, int pIdx, String text, String pattern) {
        if (cache[tIdx][pIdx] != null)
            return cache[tIdx][pIdx] == State.TRUE;

        boolean matched;
        if (pIdx == pattern.length()) {
            matched = tIdx == text.length();
        } else {
            boolean first = (tIdx < text.length() &&
                            (pattern.charAt(pIdx) == text.charAt(tIdx) || pattern.charAt(pIdx) == '.'));
            
            if (pIdx + 1 < pattern.length() && pattern.charAt(pIdx + 1) == '*')
                matched = dfs(tIdx, pIdx + 2, text, pattern) ||
                          (first && dfs(tIdx + 1, pIdx, text, pattern));
            else
                matched = first && dfs(tIdx + 1, pIdx + 1, text, pattern);
        }

        cache[tIdx][pIdx] = matched ? State.TRUE : State.FALSE;
        return matched;
    }
}
