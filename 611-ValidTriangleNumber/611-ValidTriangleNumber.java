// Last updated: 4/8/2025, 12:04:39 am
class Solution {
    public int triangleNumber(int[] nums) {
        return ValidTriangle(nums);
    }
    public static int ValidTriangle(int[]arr) {
		int count = 0;
		Arrays.sort(arr);
		for(int k=2;k<arr.length;k++) {
			int i=0, j=k-1;
			while(i<j) {
				if(arr[i]+arr[j]>arr[k]) {
					count+=j-i;
					j--;
				}else {
					i++;
				}
			}
		}
		return count;
		
	}
}