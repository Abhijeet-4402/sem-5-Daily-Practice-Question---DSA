// Last updated: 22/11/2025, 8:11:41 pm
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