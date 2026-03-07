// Last updated: 7/3/2026, 9:36:22 pm
1class Solution {
2    public String trimTrailingVowels(String s) {
3        int n = s.length();
4        int i = n-1;
5        while(i>=0){
6            if(isVowel(s.charAt(i))){
7                i--;
8            }else{
9                break;
10            }
11        }
12        return s.substring(0,i+1);
13    }
14    private boolean isVowel(char ch){
15        return ch=='a' || ch=='e' ||ch=='i' ||ch=='o' ||ch=='u';
16    }
17}