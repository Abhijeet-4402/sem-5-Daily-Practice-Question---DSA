// Last updated: 4/8/2025, 12:05:58 am
class Solution {
    public void reverseString(char[] s) {
        int start=0,end=s.length-1;
        while(start<end){
            char temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
       
    }
}