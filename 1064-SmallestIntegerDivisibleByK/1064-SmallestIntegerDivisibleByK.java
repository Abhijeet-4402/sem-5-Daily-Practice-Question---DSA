// Last updated: 4/8/2025, 12:03:02 am
class Solution {
    public int smallestRepunitDivByK(int k) {
        if(k%2==0 || k%5==0){
            return -1;
        }
        int d=1;
        long n =0;
        while(d<=k){
            n = (n * 10 + 1) % k;
            if (n == 0) {
                return d;
            }
            d++;
        }
        return -1;
    }
}