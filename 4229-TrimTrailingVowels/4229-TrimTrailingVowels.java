// Last updated: 23/7/2026, 9:34:50 am
class Solution {
    public String trimTrailingVowels(String s) {
        int n = s.length();
        int i = n-1;
        while(i>=0){
            if(isVowel(s.charAt(i))){
                i--;
            }else{
                break;
            }
        }
        return s.substring(0,i+1);
    }
    private boolean isVowel(char ch){
        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u';
    }
}