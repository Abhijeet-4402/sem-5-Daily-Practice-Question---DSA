// Last updated: 4/8/2025, 12:01:16 am
class Solution {
    public int differenceOfSums(int n, int m) {
        // int[] arr=new int[n];
        // int[] arr2=new int[n];
        int sum1=0;
        int sum2=0;
        for(int i=1;i<=n;i++){
            if(i%m==0){
                // arr[i]=i;
                sum1+=i;
            }
            else{
                // arr2[i]=i;
                sum2+=i;
            }
        }
        return sum2-sum1;
    }
}