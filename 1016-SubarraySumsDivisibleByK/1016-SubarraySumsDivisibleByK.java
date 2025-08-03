// Last updated: 4/8/2025, 12:03:19 am
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        return count_subarray(nums,k);
    }
    public static int count_subarray(int[] arr, int k) {
		int n=arr.length;
		int[] freq=new int[k];
		freq[0]=1;
		int sum=0;
		for(int i=0; i<n; i++) {
			sum+=arr[i];
			int rem=(int) (sum%k);
			if(rem<0) {
				rem+=k;  // for negative number
			}
			freq[rem]++;
		}
		int ans=0;
		for(int i=0; i<freq.length; i++) {
			if(freq[i]>=2) {
				int x=freq[i];
				ans+=((x-1)*x)/2;
			}
		}
		return ans;
	}
}