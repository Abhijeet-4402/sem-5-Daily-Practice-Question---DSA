// Last updated: 21/1/2026, 11:42:01 am
class Solution {
    public int minOperations(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int x = -1;
        for(int i  = nums.length-1; i >-1;i--){
            if(map.containsKey(nums[i])){
                x = i+1;
                break;
            }
            map.put(nums[i],1);
        }
        return (x+2)/3;
    }
}