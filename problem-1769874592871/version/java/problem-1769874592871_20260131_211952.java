// Last updated: 31/1/2026, 9:19:52 pm
1class Solution {
2    public int longestSubsequence(int[] arr) {
3        int n = arr.length;
4        if(n==0) return 0;
5        int len = 0;
6        for(int bit = 0; bit<31;bit++){
7            List<Integer> ll = new ArrayList<>();
8            for( int x: arr){
9                if((x&(1<<bit))!=0){
10                    int pos = BS(ll,x);
11                    if(pos==ll.size()) ll.add(x);
12                    else ll.set(pos,x);
13                }
14            }
15            len = Math.max(len, ll.size());
16        }
17        return len;
18    }
19    private int BS(List<Integer>ll,int target){
20        int lo = 0, hi = ll.size();
21        while(lo<hi){
22            int mid = lo+(hi-lo)/2;
23            if(ll.get(mid)<target)lo = mid+1;
24            else hi = mid;
25        }
26        return lo;
27    }
28}