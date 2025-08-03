// Last updated: 4/8/2025, 12:07:00 am
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left=0;
        int right=numbers.length-1;
        while(left<right){
            int sum=numbers[left]+numbers[right];
            if (sum==target){
                int[] result={left+1,right+1};
                return result;
            }
            else if(sum<target){
                left++;
            }
            else{
                right--;
            }
        }
        int[] result={-1,-1};
        return result;
        
    }
}