// Last updated: 23/7/2026, 9:35:02 am
class Solution {
    public static int countMonobit(int n) {
		int c = 0;
		int num = 0;
		long tp = 1;
		while(num<=n) {
			c++;
			num+=tp;
			tp*=2;
		}
		return c;
	}
}