// Last updated: 21/1/2026, 11:43:43 am
class Solution {
    public int totalSteps(int[] nums) {
        int n = nums.length;
        
        Stack<int[]> st = new Stack<>();
        int max = 0;

        for (int num : nums) {
            int curr = 0;
            
            while (!st.isEmpty() && st.peek()[0] <= num) {
                curr = Math.max(curr, st.peek()[1]);
                st.pop();
            }
            
            if (st.isEmpty()) {
                st.push(new int[]{num, 0});
            } else {
                curr++;
                max = Math.max(max, curr);
                st.push(new int[]{num, curr});
            }
        }
        
        return max;
    }
}