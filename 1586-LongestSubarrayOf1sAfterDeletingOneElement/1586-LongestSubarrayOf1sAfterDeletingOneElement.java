// Last updated: 4/8/2025, 12:02:20 am
class Solution {
    public int longestSubarray(int[] arr) {
        int ans = 0;
        int zeros = 0;

        for(int l = 0,r=0;r<arr.length;r++){
            if(arr[r]==0)zeros++;
            while(zeros==2)
                if(arr[l++]==0)
                    zeros--;
            ans=Math.max(ans,r-l);
        }
        return ans;
    }
}