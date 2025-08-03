// Last updated: 4/8/2025, 12:04:35 am
class Solution {
    public boolean judgeSquareSum(int c) {
        long right=(int)Math.sqrt(c);
		long left=0;

		while(left<=right)
		{
			
			long sum =left*left+right*right;
			if (sum==c)
			return true;
			else if(sum<c)
			left++;
			else
			right--;
		}
		return false;

        
    }
}