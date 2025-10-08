// Last updated: 9/10/2025, 1:31:09 am
class Solution {
    public int[] countBits(int n) {
    int[] arr = new int[n+1];
		
		for(int i = 0; i<n+1;i++) {
			arr[i]=Ones(i,arr);
		}
		
		return arr;
	}

	private static int Ones(int n,int[] arr) {
		// TODO Auto-generated method stub
		if( n == 0 ) return 0;
		if( n == 1 ) return 1;
		int nearest = 1<< (int)(Math.log(n)/Math.log(2));
		return Ones(n-nearest, arr)+1;
	}
}
