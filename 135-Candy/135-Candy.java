// Last updated: 4/8/2025, 12:07:21 am
class Solution {
    public int candy(int[] arr) {
        int [] temp = new int [arr.length];
        for(int i = 0 ; i<temp.length;i++)temp[i]=1;
        for(int i = 1 ; i<temp.length;i++){
            if(arr[i]>arr[i-1]){
                temp[i]=temp[i-1]+1;
            }
        }
        for(int i = temp.length-2; i>-1;i--){
            if(arr[i]>arr[i+1]){
                temp[i]=Math.max(temp[i],temp[i+1]+1);
            }
        }
        int ans = 0;
        for(int i : temp)ans+=i;
        return ans;
    }
}