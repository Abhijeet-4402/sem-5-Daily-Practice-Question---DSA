// Last updated: 4/8/2025, 12:00:38 am
class Solution {
    public String findValidPair(String s) {
        int []  l = new int[10];
        for(int i = 0 ; i<s.length();i++){
            l[s.charAt(i)-'0']+=1;
        }
        for(int i = 0; i<s.length()-1;i++){          if(s.charAt(i)!=s.charAt(i+1)&&s.charAt(i)-'0'==l[s.charAt(i)-'0']&&s.charAt(i+1)-'0'==l[s.charAt(i+1)-'0']){
                return s.substring(i,i+2);
            }
        }
        return "";
    }
}
