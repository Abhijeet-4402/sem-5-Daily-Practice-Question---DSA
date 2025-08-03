// Last updated: 4/8/2025, 12:05:29 am
class Solution {
    public int countSegments(String s) {
        
        int count = 0;
        if(s.isEmpty()){
            return 0;
        }
        String arr[] =  s.split(" ");
        for(int i=0; i<arr.length; i++){
            if(!arr[i].isEmpty()){
            count++;
            }
        }
      
        return count;
    }
}