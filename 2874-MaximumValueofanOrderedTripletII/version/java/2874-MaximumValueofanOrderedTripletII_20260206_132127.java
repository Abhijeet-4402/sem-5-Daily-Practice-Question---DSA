// Last updated: 6/2/2026, 1:21:27 pm
1class Solution {
2    public int maxFrequency(int[] nums, int k) {
3        HashMap<Integer, Integer> mp  =new HashMap<>();
4        int countK = 0;
5        int max = 0;
6        for(int x: nums){
7            if(x==k){
8                countK++;
9            }else{
10                int curr = mp.getOrDefault(x,0)-countK;
11                curr  = Math.max(1,curr+1);
12                mp.put(x,curr+countK);
13                max = Math.max(max,curr);
14            }
15
16        }
17        return countK + max;
18    }
19}