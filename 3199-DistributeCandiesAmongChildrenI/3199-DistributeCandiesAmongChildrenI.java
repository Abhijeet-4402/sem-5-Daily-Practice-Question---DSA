// Last updated: 4/8/2025, 12:01:14 am
class Solution {
    public int distributeCandies(int n, int limit) {
        return CO(n)-(3*CO(n-(limit+1)))+(3*CO(n-2*(limit+1)))-(CO(n-3*(limit+1)));
    }
    public int CO(int n){
        if(n<0) return 0;
        return ((n+2)*(n+1))/2;
    }
}