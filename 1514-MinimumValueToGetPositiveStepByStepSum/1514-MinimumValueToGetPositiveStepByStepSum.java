// Last updated: 4/8/2025, 12:02:26 am
class Solution {
    public int minStartValue(int[] nums) {
        return startValue(nums);
    }
    public static int startValue(int[] arr){
      
        int start = 1;
        int minimum = Integer.MAX_VALUE;
        for(int x:arr){
            start+=x;
            minimum=Math.min(minimum,start);

        }
        if(minimum<1){
            return 1-minimum+1;
        }
        return 1;
    }
}