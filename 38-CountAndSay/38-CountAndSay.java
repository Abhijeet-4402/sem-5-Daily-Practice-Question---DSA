// Last updated: 4/8/2025, 12:08:41 am
class Solution {
    public String countAndSay(int n) {
        if(n==1)return "1";
        return RLE(countAndSay(n-1));
    }
    public String RLE(String s){
        StringBuilder sb = new StringBuilder();
        int c = 1;
        char a = s.charAt(0);
        for(int i = 1 ; i<s.length();i++){
            if(a==s.charAt(i))c++;
            else{
                sb.append(c);
                sb.append(a);
                a=s.charAt(i);
                c=1;
            }
        }
        sb.append(c);
        sb.append(a);
        return sb.toString();
    }
}