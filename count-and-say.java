class Solution {
    public String countAndSay(int n) {
        String term = "1";
        for (int i = 1; i < n; i++) {
            StringBuilder next = new StringBuilder();
            int count = 1;
            for (int j = 1; j < term.length(); j++) {
                if (term.charAt(j) == term.charAt(j - 1)) count++;
                else {
                    next.append(count).append(term.charAt(j - 1));
                    count = 1;
                }
            }
            next.append(count).append(term.charAt(term.length() - 1));
            term = next.toString();
        }
        return term;
    }
}
