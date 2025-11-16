// Last updated: 16/11/2025, 9:01:50 am
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0, b = 0;
        for(char c : s.toCharArray()){
            int x = c=='a'?a++:b++;
        }

        return Math.abs(a-b);
        
    }
}