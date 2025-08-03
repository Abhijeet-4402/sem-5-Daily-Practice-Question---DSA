// Last updated: 4/8/2025, 12:02:00 am
class Solution {
    public int maximumScore(int a, int b, int c) {
        if (b > a) {
            int temp = a;
            a = b;
            b = temp;
        }
        if (c > a) {
            int temp = a;
            a = c;
            c = temp;
        }
        if (b < c) {
           int temp = b;
            b = c;
            c = temp;
        }
        return Math.min(a + b + c - Math.max(a, Math.max(b, c)), (a + b + c) / 2);
    }
}