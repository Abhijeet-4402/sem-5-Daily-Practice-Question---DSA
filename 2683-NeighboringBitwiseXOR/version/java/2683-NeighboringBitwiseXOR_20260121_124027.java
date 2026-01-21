// Last updated: 21/1/2026, 12:40:27 pm
1class Solution {
2    public int minimizeXor(int num1, int num2) {
3        int c = countSetBit(num2);
4        int ans = 0;
5        for(int i = 30; i>=0;i--){
6            int mask = 1<<i;
7            if((num1 & mask) != 0){
8                ans|=mask;
9                if(--c == 0) return ans;
10            }
11        }
12
13        for(int i = 0; i<=30;i++){
14            int mask = 1<<i;
15            if((num1 & mask) == 0){
16                ans|=mask;
17                if(--c == 0) return ans;
18            }
19        }
20        return ans;
21        
22    }
23    private static int countSetBit(int n){
24        int c = 0;
25        while(n > 0){
26            n&=n-1;
27            c++;
28        }
29        return c;
30    }
31}