// Last updated: 4/8/2025, 12:05:36 am
class Solution {
    public int thirdMax(int[] nums) {
        return ThirdDistinct(nums);
    }
    public int ThirdDistinct(int[]arr){
        Arrays.sort(arr);
        int count = 1;
        int ans = 0;
        int val = arr[arr.length-1];
        for(int i=arr.length-2;i>=0; i-- ){
            
            if(arr[i]<val){
                ans = arr[i];
                val = arr[i];
                count++;
            }
            if(count==3){
                break;
            }

        }
        if(count!=3){
            return arr[arr.length-1];
        }
        return ans;
    }
}