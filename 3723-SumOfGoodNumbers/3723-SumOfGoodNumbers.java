// Last updated: 4/8/2025, 12:00:42 am
class Solution {
    public int sumOfGoodNumbers(int[] arr, int k) {
        int sum = 0;
        for(int i =0;i<arr.length;i++){
            if(i-k>=0 && arr[i]<=arr[i-k])continue;
            else if(i+k<arr.length && arr[i]<=arr[i+k])continue;
            sum+=arr[i];
        }
        return sum;
    }
}