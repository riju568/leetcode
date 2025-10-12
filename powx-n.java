class Solution {
    private double fastPow(double a, long b) {
        double res = 1.0;
        while (b > 0) {
            if ((b & 1) == 1) res *= a;
            a *= a;
            b >>= 1;
        }
        return res;
    }

    public double myPow(double x, int n) {
        long exp = n;
        if (exp < 0) {
            x = 1 / x;
            exp = -exp;
        }
        return fastPow(x, exp);
    }
}
