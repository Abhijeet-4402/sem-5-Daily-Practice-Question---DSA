// Last updated: 29/11/2025, 1:29:21 am
1class Solution {
2    public int trap(int[] arr) {
3        int n = arr.length;
4        int[] pre  = new int[n];
5        int[] suf = new int[n];
6
7        pre[0] = arr[0];
8        suf[n-1] = arr[n-1];
9
10        for( int i =1; i <n; i++) pre[i] = Math.max(pre[i-1], arr[i]);
11        for( int i = n-2; i >-1;i--) suf[i] = Math.max(suf[i+1], arr[i]);
12
13        int ans  =0;
14        for( int i =0; i<n;i++) ans+=Math.min(pre[i],suf[i]) - arr[i];
15        
16        return ans;
17    }
18}