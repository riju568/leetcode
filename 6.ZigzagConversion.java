/*
* 6: Zigzag Conversion
* https://leetcode.com/problems/zigzag-conversion/
*/

class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1 || s.length() <= numRows) return s;

        StringBuilder[] rows = new StringBuilder[numRows];
        for (int i = 0; i < numRows; i++) rows[i] = new StringBuilder();

        int row = 0;       // Current row index
        boolean goingDown = false; // Direction flag

        for (char c : s.toCharArray()) {
            rows[row].append(c); // Add char to current row
            // Change direction if we reach top or bottom
            if (row == 0 || row == numRows - 1) goingDown = !goingDown;
            row += goingDown ? 1 : -1;
        }

        // Combine all rows into one string
        StringBuilder result = new StringBuilder();
        for (StringBuilder r : rows) result.append(r);
        return result.toString();
    }
}
