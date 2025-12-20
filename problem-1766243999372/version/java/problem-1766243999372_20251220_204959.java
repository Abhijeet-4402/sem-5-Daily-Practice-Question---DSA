// Last updated: 20/12/2025, 8:49:59 pm
1class Solution {
2    public int minOperations(int[] nums) {
3        HashMap<Integer, Integer> map = new HashMap<>();
4        int x = -1;
5        for(int i  = nums.length-1; i >-1;i--){
6            if(map.containsKey(nums[i])){
7                x = i+1;
8                break;
9            }
10            map.put(nums[i],1);
11        }
12        return (x+2)/3;
13    }
14}