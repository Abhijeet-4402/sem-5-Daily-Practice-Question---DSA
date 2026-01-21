// Last updated: 21/1/2026, 11:42:30 am
class Solution {
   public static boolean scoreBalance(String s) {
		int total = 0;
		char[] c = s.toCharArray();
		for(char ch: c) {
			total+= ch - 'a'+1;
		}
		int temp = 0;
		for(char ch : c) {
			temp+=ch-'a'+1;
			if(2*temp==total) return true;
		}
		
		return false;
	}
}