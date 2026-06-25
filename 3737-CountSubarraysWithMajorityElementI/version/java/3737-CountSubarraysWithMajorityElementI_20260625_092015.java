// Last updated: 25/6/2026, 9:20:15 am
1class Solution {
2    public int countMajoritySubarrays(int[] arr, int target) {
3        int n  =arr.length;
4        long[] pref = new long[n+1];
5        for(int i = 0 ; i<n;i++){
6            pref[i+1] =  pref[i] + (arr[i]==target?1:-1);
7        }
8        TreeMap<Long, Integer> map = new TreeMap<>();
9        map.put(0L,1);
10
11        int ans  = 0;
12        for(int i  = 1;i<= n;i++){
13            long curr  = pref[i];
14            for(long key:map.headMap(curr, false).keySet()){
15                ans+=map.get(key);
16            }
17            map.put(curr, map.getOrDefault(curr, 0)+1);
18        }
19        return ans;
20    }
21}