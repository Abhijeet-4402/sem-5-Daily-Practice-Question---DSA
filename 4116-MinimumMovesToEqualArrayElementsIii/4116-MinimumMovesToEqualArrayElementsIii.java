// Last updated: 21/1/2026, 11:42:14 am
class Solution {
    public int minMoves(int[] arr) {
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : arr) mx = Math.max(i,mx);
        for(int i : arr) sum+=mx-i;
        return sum;
    }
}