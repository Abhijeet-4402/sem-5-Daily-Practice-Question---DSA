// Last updated: 4/8/2025, 12:05:52 am
class Solution {
    public int getSum(int a, int b) {
        while(b!=0){
            int c = a&b;
            a^=b;
            b= c<<1;
        }
        return a;
        
    }
}