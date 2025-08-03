// Last updated: 4/8/2025, 12:02:41 am
class Solution {
    public int[] decompressRLElist(int[] nums) {
          List<Integer> ans = new ArrayList<>();
        int len = 0;

        for(int i=0; i<nums.length; i+=2){
            int freq = nums[i];
            int val = nums[i+1];
            len += freq;

            while(freq != 0){
                ans.add(val);
                freq --;
            }
        }

        int[] arr = new int[len];
        for(int i=0; i<len; i++){
            arr[i] = ans.get(i);
        }
        
        return arr;
        
    }
}