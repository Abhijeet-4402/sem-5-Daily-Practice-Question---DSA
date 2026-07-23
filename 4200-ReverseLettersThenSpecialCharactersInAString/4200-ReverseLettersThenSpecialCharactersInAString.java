// Last updated: 23/7/2026, 9:35:00 am
class Solution {
    public String reverseByType(String s) {
        int n = s.length();
        char[] let = new char[n];
        char[] sep = new char[n];
        int li=0,si=0;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z')let[li++] =ch;
            else sep[si++] = ch;
        }
        StringBuilder ans = new StringBuilder();
        li--;si--;
        for(char ch:s.toCharArray()){
            if(ch>='a' && ch<='z')ans.append(let[li--]);
            else ans.append(sep[si--]);
        }

        return ans.toString();
    }
}