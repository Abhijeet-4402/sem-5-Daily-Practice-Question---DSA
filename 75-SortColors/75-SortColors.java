// Last updated: 4/8/2025, 12:07:54 am
class Solution {
    public void sortColors(int[] nums) {
        
        int tick=0;
        int start=0;
	int end=nums.length-1;
        while(tick<=end){
            if(nums[tick]==0){
                int temp=nums[tick];
                nums[tick]=nums[start];
                nums[start]=temp;
                ++start;
                ++tick;
            }

            else if(nums[tick]==1){
                tick++;
            }
            else{
                int temp=nums[tick];
                nums[tick]=nums[end];
                nums[end]=temp;
                end--;
                
            }

        }
        
            
        }
    }
