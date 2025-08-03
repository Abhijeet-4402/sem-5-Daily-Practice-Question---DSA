// Last updated: 4/8/2025, 12:06:57 am
class Solution {
    public int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            n /= 5;
            res += n;
        }
    return res;
    }
}