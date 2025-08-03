// Last updated: 4/8/2025, 12:01:32 am
class Solution {
    public String smallestNumber(String pattern) {
        StringBuilder s = new StringBuilder();
        int [] arr = new int[pattern.length()+1];
        Stack<Integer> st = new Stack<>();
        int count = 1;
        for(int i = 0 ; i<=pattern.length(); i++){
            if(i==pattern.length()||pattern.charAt(i)=='I'){
                arr[i]=count++;
                while(!st.isEmpty()){
                    arr[st.pop()] = count++;
                }
            }else{
                st.push(i);
            }
        }
        for(int i:arr){
            s.append(i);
        }
        return s.toString();
    }
}