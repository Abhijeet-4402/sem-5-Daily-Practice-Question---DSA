// Last updated: 4/8/2025, 12:04:25 am
class Solution {
    public boolean validPalindrome(String s) {
        return isPalindrome(s);
    }
    public static boolean isPalindrome(String s){
        int lo=0, hi=s.length()-1;
        while(hi>lo){
            if(s.charAt(lo)!=s.charAt(hi)){
                if(checkPalindrome(lo+1,hi,s) || checkPalindrome(lo,hi-1,s))return true;
                return false;

            }
            lo++;
            hi--;
        }
        return true;
    }
    
    public static boolean checkPalindrome(int lo, int hi, String s){
       while(hi>lo){
        if(s.charAt(hi)!=s.charAt(lo))return false;
        hi--;
        lo++;
       }
        return true;
    }
}