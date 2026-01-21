// Last updated: 21/1/2026, 11:42:20 am
class Solution {
    public int minLengthAfterRemovals(String s) {
        int a = 0, b = 0;
        for(char c : s.toCharArray()){
            int x = c=='a'?a++:b++;
        }

        return Math.abs(a-b);
        
    }
}