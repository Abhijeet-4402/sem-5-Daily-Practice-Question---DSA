// Last updated: 28/2/2026, 10:47:45 pm
1class Solution {
2    public int[] countBits(int n) {
3        int[] ans = new int[n+1];
4        for (int i = 0; i <= n; i++) {
5            int count = 0;
6            int num = i;
7            while(num>0){
8                count++;
9                num = num&(num-1);
10            }
11            ans[i] = count;
12        }
13        return ans;
14    }
15}