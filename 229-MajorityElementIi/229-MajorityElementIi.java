// Last updated: 4/8/2025, 12:06:35 am
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int count1=0,count2=0,candidate1=0,candidate2=1;
        
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
            else if(count1==0){
                candidate1=num;
                count1=1;
            }
            else if(count2==0){
                candidate2=num;
                count2=1;
            }else{
                count1--;
                count2--;
            }
        }
        //verifying the candidtes choosen
        count1=count2=0;
        for(int num:nums){
            if(num==candidate1){
                count1++;
            }
            else if(num==candidate2){
                count2++;
            }
        }
        List<Integer> ans=new ArrayList<>();
        if(count1>nums.length/3){
            ans.add(candidate1);
        }
        if(count2>nums.length/3){
            ans.add(candidate2);
        }
        return ans;
    
    }
}