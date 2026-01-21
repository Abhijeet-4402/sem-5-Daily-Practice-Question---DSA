// Last updated: 21/1/2026, 11:42:12 am
class Solution {
    public int minimumFlips(int n) {
        String s = Integer.toBinaryString(n);
		int l = 0;
		int r = s.length()-1;
		int ans = 0;
		while(l<r) if(s.charAt(l++)!=s.charAt(r--)) ans+=2;
    	return ans;
    }
}