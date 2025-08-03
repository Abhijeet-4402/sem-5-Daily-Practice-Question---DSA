// Last updated: 4/8/2025, 12:00:33 am
class Solution {
    public int reverseDegree(String s) {
        char[] ch = s.toCharArray();
        int ans = 0;
        for(int i = 0 ; i< ch.length ; i++){
            ans+=((-1*(ch[i]-123))*(i+1));
        }
        return ans;
    }
}