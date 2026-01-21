// Last updated: 21/1/2026, 11:43:56 am
class Solution {
    public int countGoodSubstrings(String s) {
        int count = 0;

        for(int i = 2; i < s.length();i++){
            if(s.charAt(i)!=s.charAt(i-1) && s.charAt(i)!=s.charAt(i-2) && s.charAt(i-1)!=s.charAt(i-2)  ) count++;
        }

        return count;
    }
}