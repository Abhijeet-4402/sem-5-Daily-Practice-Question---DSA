// Last updated: 4/8/2025, 12:05:44 am
class Solution {
    public int lastRemaining(int n) {
        
        return n==1?1: 2*(1+n/2-lastRemaining(n/2));
    }
}