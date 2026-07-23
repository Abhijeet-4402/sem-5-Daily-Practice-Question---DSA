// Last updated: 23/7/2026, 9:35:31 am
class Solution {
    public int longestSubsequence(int[] arr) {
        int n = arr.length;
        if(n==0) return 0;
        int len = 0;
        for(int bit = 0; bit<31;bit++){
            List<Integer> ll = new ArrayList<>();
            for( int x: arr){
                if((x&(1<<bit))!=0){
                    int pos = BS(ll,x);
                    if(pos==ll.size()) ll.add(x);
                    else ll.set(pos,x);
                }
            }
            len = Math.max(len, ll.size());
        }
        return len;
    }
    private int BS(List<Integer>ll,int target){
        int lo = 0, hi = ll.size();
        while(lo<hi){
            int mid = lo+(hi-lo)/2;
            if(ll.get(mid)<target)lo = mid+1;
            else hi = mid;
        }
        return lo;
    }
}