// Last updated: 21/1/2026, 11:42:05 am
class Solution {
    public int[] bestTower(int[][] towers, int[] center, int radius) {
        long x = center[0];
        long y = center[1];

        Arrays.sort(towers,(a,b)->a[0]==b[0]?a[1]-b[1]:a[0]-b[0]);
        long best = Integer.MIN_VALUE;
        int [] ans = new int[]{-1, -1};

        for(int[] curr : towers){
            if(Math.abs(curr[0]-x) + Math.abs(curr[1]-y)<=radius){
                if(best<curr[2]){
                    best = curr[2];
                    ans[0] = curr[0];
                    ans[1] = curr[1];
                }
            }
        }
        return ans;
    }
}