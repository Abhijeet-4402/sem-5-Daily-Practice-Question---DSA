// Last updated: 21/1/2026, 11:42:04 am
class Solution {
    public int minOperations(int[] nums, int[] target) {
        Set<Integer> st = new HashSet<>();
        for(int i = 0; i < nums.length; i++){
            if(nums[i]!=target[i]) st.add(nums[i]);
        }
        return st.size();
    }
    
}