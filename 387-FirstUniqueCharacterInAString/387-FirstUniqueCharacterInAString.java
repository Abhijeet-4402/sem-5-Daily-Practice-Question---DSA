// Last updated: 4/8/2025, 12:05:45 am
class Solution {
    public int firstUniqChar(String s) {
        int [] arr = new int [26];
        for(int i = 0; i< s.length();i++){
            arr[(int)s.charAt(i)-97]+=1;
        }
        for(int i = 0; i< s.length();i++){
           if(arr[(int)s.charAt(i)-97]==1){
            return i;
           }
        }
        return -1;
    }
}