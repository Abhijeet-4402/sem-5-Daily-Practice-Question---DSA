// Last updated: 4/8/2025, 12:01:54 am
class Solution {
    public int findTheWinner(int n, int k) {
        int index = findWinnerIndex(n, k);
        return index+1;
    }

    public int findWinnerIndex(int n, int k){
      
      if(n==1)
       return 0;
    

    return (findWinnerIndex(n-1, k) + k)% n;
 }
}