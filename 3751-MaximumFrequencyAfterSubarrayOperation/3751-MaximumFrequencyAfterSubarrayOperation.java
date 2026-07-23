// Last updated: 23/7/2026, 9:35:43 am
class Solution {
    public int maxFrequency(int[] nums, int k) {
        HashMap<Integer, Integer> mp  =new HashMap<>();
        int countK = 0;
        int max = 0;
        for(int x: nums){
            if(x==k){
                countK++;
            }else{
                int curr = mp.getOrDefault(x,0)-countK;
                curr  = Math.max(1,curr+1);
                mp.put(x,curr+countK);
                max = Math.max(max,curr);
            }

        }
        return countK + max;
    }
}