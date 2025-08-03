// Last updated: 4/8/2025, 12:02:27 am
class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> a=new ArrayList<Integer>();
        int[] ans=new int[nums.length];
        int n=nums.length;
        for(int i=0;i<n;i++){
            a.add(index[i],nums[i]);
        }
        for(int j=0;j<n;j++){
            ans[j]=a.get(j);

        }

        return ans;
        
    }
}



