// Last updated: 4/8/2025, 12:01:51 am
class Solution {
    public int subsetXORSum(int[] nums) {
        return findSubset(nums,0,0);
    }
	public static int findSubset(int[]arr, int idx,int xor) {
		if(idx>=arr.length) {
			
			return xor;
		}
		int n = arr[idx];
		int a=findSubset(arr,idx+1,xor);
		int b = findSubset(arr,idx+1,xor^n);
		return a+b;
	}
	
	
}