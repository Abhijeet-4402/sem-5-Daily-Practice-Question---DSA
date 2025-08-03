// Last updated: 4/8/2025, 12:07:52 am
class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ll = new ArrayList<>();
        Arrays.sort(nums);
        shubh(nums,ans,ll,0);
        return ans;

    }
    public void shubh(int[] arr,List<List<Integer>> ans,List<Integer> ll,int idx ){
        if(idx==arr.length){
            ans.add(new ArrayList<>(ll));
            return;
        }
        shubh(arr,ans,ll,idx+1);
        ll.add(arr[idx]);
        shubh(arr,ans,ll,idx+1);
        ll.remove(ll.size()-1);
    }   
}