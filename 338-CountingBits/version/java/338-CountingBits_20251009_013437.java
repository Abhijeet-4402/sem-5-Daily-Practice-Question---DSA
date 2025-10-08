// Last updated: 9/10/2025, 1:34:37 am
class Solution {
    public int[] countBits(int n) {
    int[] arr = new int[n+1];
		
		for(int i = 0; i<n+1;i++) {
			Ones(i,arr);
		}
		
		return arr;
	}

	private static int Ones(int n,int[] arr) {
		// TODO Auto-generated method stub
		if( n == 0 ) return 0;
		if( n == 1 ) return arr[1] = 1;
        if(arr[n]!=0) return arr[n];
		int nearest = 1 << (int)(Math.log(n)/Math.log(2));
		return arr[n] = Ones(n-nearest, arr)+1;
	}
}
