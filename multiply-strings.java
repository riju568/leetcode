class Solution {
    public String multiply(String a, String b) {
        if (a.equals("0") || b.equals("0")) return "0";
        int n = a.length(), m = b.length();
        int[] res = new int[n + m];
        
        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int mul = (a.charAt(i) - '0') * (b.charAt(j) - '0');
                int sum = res[i + j + 1] + mul;
                res[i + j + 1] = sum % 10;
                res[i + j] += sum / 10;
            }
        }
        
        StringBuilder sb = new StringBuilder();
        for (int num : res)
            if (!(sb.length() == 0 && num == 0))
                sb.append(num);
        return sb.toString();
    }
}
