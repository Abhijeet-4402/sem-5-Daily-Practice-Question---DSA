// Last updated: 4/8/2025, 12:05:03 am
class Solution {
    public int findMaxConsecutiveOnes(int[] arr) {
        int count = 0; 
    int result = 0; 
    for (int i = 0; i < arr.length; i++)
    {
        
        if (arr[i] == 0)
            	count = 0;
 
        else
        	count++;
        result = Math.max(result, count);  
        
    }
    return result;   
    }
}