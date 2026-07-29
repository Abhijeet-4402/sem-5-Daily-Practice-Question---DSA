// Last updated: 29/7/2026, 10:16:25 pm
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int [][] arr = new int[nums.length][2];
4        for(int i = 0; i < nums.length; i++){
5            arr[i][0] = nums[i];
6            arr[i][1] = i;
7        }
8        Arrays.sort(arr, (a,b)->a[0]-b[0]);
9        int[] ans = new int[2];
10        int i = 0;
11        int j = nums.length-1;
12        while(i<j){
13            int sum = arr[i][0] + arr[j][0];
14            if(sum==target){
15                ans[0] = arr[i][1];
16                ans[1] = arr[j][1];
17                break;
18            }else if(sum>target){
19                j--;
20            }else{
21                i++;
22            }
23        }
24        return ans;
25    }
26}