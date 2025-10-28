// Last updated: 28/10/2025, 3:23:18 pm
class Solution {
    public int countValidSelections(int[] nums) {
        int count = 0;
        int sum = 0;
        int csum =0;
        for(int i : nums){
            sum+=i;
        }
        for(int i : nums){
            csum+=i;
            if(i==0){
                if(2*csum-sum == 0){
                    count+=2;
                }else if(2*csum-sum == 1 || 2*csum-sum == -1 ){
                    count+=1;
                }
            }
        }
        return count;
    }
}