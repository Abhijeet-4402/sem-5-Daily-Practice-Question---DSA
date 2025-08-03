// Last updated: 4/8/2025, 12:02:52 am
class Solution {
     public String removeDuplicates(String s) {
        StringBuilder sd=new StringBuilder();
        for (char c:s.toCharArray()){
            int size=sd.length();
            if (size>0&&sd.charAt(size-1)==c){
                sd.deleteCharAt(size-1);
            }
            else {
                sd.append(c);
            }
        }
        return sd.toString();
    }
}