class Solution {
    public String convertToTitle(int colNum) {
        StringBuilder title = new StringBuilder();
        while (colNum > 0) {
            int rem = (colNum - 1) % 26;
            title.insert(0, (char) ('A' + rem));
            colNum = (colNum - 1) / 26;
        }
        return title.toString();
    }
}
