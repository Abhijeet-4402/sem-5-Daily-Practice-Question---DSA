// Last updated: 11/1/2026, 11:50:23 pm
1class Solution {
2    public int maxWidthRamp(int[] nums) {
3        int n  = nums.length;
4        Stack<Integer> st = new Stack<>();
5        for(int i = 0; i < n; i++){
6            if(st.isEmpty() || nums[i]<nums[st.peek()]){
7                st.push(i);
8            }
9        }
10        int width = 0;
11        for(int i = n-1; i >-1; i--){
12            while(!st.isEmpty() && nums[i]>=nums[st.peek()]){
13                int idx = st.pop();
14                width = Math.max(width, i-idx);
15            }
16        }
17        return width;
18    }
19}