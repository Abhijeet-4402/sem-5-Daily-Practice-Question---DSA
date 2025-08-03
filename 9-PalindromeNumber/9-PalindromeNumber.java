// Last updated: 4/8/2025, 12:09:20 am
class Solution {
    public boolean isPalindrome(int num) {
        if(num < 0)return false;
        int reversed = 0,original = num,remainder;
		while(num != 0) {
			remainder = num % 10;
			reversed = reversed * 10 + remainder;
			num = num/10;
		}
		return original == reversed;
    }
}