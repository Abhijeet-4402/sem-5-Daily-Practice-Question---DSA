// Last updated: 23/7/2026, 9:34:58 am
class Solution {
    public long countSubarrays(int[] nums, long k) {
        Deque<Integer> max = new ArrayDeque<>();
        Deque<Integer> min = new ArrayDeque<>();
        long ans = 0;
        int l = 0;
        for(int r = 0; r<nums.length;r++){
            while(!max.isEmpty() && nums[max.peekLast()]<=nums[r]) max.pollLast();
            max.offer(r);

            while(!min.isEmpty() && nums[min.peekLast()]>=nums[r]) min.pollLast();
            min.offer(r);


            while(l<=r){
                long diff = (long)nums[max.peekFirst()] - nums[min.peekFirst()];
                if(diff*(r-l+1L)<=k) break;
                if(max.peekFirst() == l)max.pollFirst();
                if(min.peekFirst() == l)min.pollFirst();
                l++;
            }

            ans+=(r-l+1);
                
        }

        return ans;
    }
}