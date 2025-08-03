// Last updated: 4/8/2025, 12:00:50 am
class Solution {
    public int smallestNumber(int n) {
        int set_bit = 2;
        int ans = 1;
        while(n>1){
            ans+=set_bit;
            set_bit*=2;
            n/=2;
        }
        return ans;
    }
}