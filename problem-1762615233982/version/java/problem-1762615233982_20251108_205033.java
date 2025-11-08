// Last updated: 8/11/2025, 8:50:33 pm
class Solution {
    public int countMajoritySubarrays(int[] arr, int target) {
        int n  =arr.length;
        long[] pref = new long[n+1];
        for(int i = 0 ; i<n;i++){
            pref[i+1] =  pref[i] + (arr[i]==target?1:-1);
        }
        TreeMap<Long, Integer> map = new TreeMap<>();
        map.put(0L,1);

        int ans  = 0;
        for(int i  = 1;i<= n;i++){
            long curr  = pref[i];
            for(long key:map.headMap(curr, false).keySet()){
                ans+=map.get(key);
            }
            map.put(curr, map.getOrDefault(curr, 0)+1);
        }
        return ans;
    }
}