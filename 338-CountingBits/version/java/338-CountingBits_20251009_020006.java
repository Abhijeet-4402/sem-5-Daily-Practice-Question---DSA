// Last updated: 9/10/2025, 2:00:06 am
class Solution {
    public int[] countBits(int n) {
        if (n == 0) return new int[]{0};
		int[] arr = new int[n+1];
		arr[1] = 1;
        int prev = 2;
		int nxt = 4;
		for(int i = 2; i < n+1; i++) {
			if(i<nxt) {
				arr[i] = arr[i-prev]+1;
			}else if(i == nxt) {
				arr[i] = 1;
				prev = nxt;
				nxt*=2;
			}
		}
        return arr;
    }
}