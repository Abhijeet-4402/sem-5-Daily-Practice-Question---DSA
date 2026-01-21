// Last updated: 21/1/2026, 11:42:32 am
class Solution {
    public int longestBalanced(int[] nums) {
        Set<Integer> even = new HashSet<>();
        Set<Integer> odd = new HashSet<>();
        int ans = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++){
            even.clear();
            odd.clear();
            for( int j = i; j < nums.length; j++){
                if((nums[j]&1)==1) odd.add(nums[j]);
                else even.add(nums[j]);

                if(odd.size() == even.size()) ans = Math.max(ans, j-i+1);
            }
        }

        return ans==Integer.MIN_VALUE?0:ans;
    }
}