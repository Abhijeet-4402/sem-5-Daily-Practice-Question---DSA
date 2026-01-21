// Last updated: 21/1/2026, 11:42:00 am
class Solution {
    public long lastInteger(long n) {
       long start = 1;
        long gap = 1;
        boolean left = true;
        while(n>1){
            if(!left && (n%2==0)){
                start+=gap;
            }
            gap<<=1;
            n= (n+1)>>1;
            left = !left;
        }
        return start;
    }
}