// Last updated: 1/2/2026, 9:11:56 pm
1class Solution {
2    public int countMonobit(int n) {
3        int c = 1;
4        for(int i = 1;i<=n;i++){
5            if((i&(i+1))==0)c++;
6        }
7        return c;
8    }
9}