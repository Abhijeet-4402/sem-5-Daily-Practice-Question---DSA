// Last updated: 8/11/2025, 8:06:55 pm
class Solution {
    public int minMoves(int[] arr) {
        int mx = Integer.MIN_VALUE;
        int sum = 0;
        for(int i : arr) mx = Math.max(i,mx);
        for(int i : arr) sum+=mx-i;
        return sum;
    }
}