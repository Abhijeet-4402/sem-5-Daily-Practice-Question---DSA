// Last updated: 23/7/2026, 9:34:57 am
class Solution {
    public List<Long> mergeAdjacent(int[] nums) {
        Deque<Long> dq = new ArrayDeque<>();
        for(int num: nums){
            long curr = (long) num;
            while(!dq.isEmpty() && dq.peekLast()==curr){
                curr+=dq.pollLast();
            }
            dq.offer((long)curr);
            
        }
        return new ArrayList<>(dq);
    }
}