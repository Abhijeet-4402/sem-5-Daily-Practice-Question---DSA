// Last updated: 4/8/2025, 12:05:43 am
class Solution {
    public boolean isSubsequence(String s, String t) {
        int i=0,j=0,n=s.length(),m=t.length();
        while(i<n && j<m){
            if(s.charAt(i)==t.charAt(j)){
                i++;
            
                
            }
            j++;
            
        }
        return i==n;
        
    }
}