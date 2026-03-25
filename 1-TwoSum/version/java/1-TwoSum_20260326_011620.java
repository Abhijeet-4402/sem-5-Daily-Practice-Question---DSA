// Last updated: 26/3/2026, 1:16:20 am
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        return FindIdx(nums, target);
4    }
5    public int[] FindIdx(int[] nums, int target){
6        int[]arr = new int[nums.length];
7        for(int i=0; i<nums.length;i++){
8            arr[i] = nums[i];
9        }
10        Arrays.sort(arr);
11        int i=0;
12        int j=arr.length-1;
13        int []ans = new int[2];
14        while(i<j){
15            int sum= arr[i]+arr[j];
16            if(sum==target){
17                i=arr[i];
18                j=arr[j];
19                break;
20            }
21            else if(sum>target){
22                j--;
23            }else{
24                i++;
25            }
26        }
27        // System.out.print(i+" "+j);
28        int count=0;
29        for(int k=0; k<nums.length; k++){
30            if(i==nums[k]){
31                ans[0] = k;
32                break;
33            }
34        }
35        for(int k=nums.length-1;k>=0;k--){
36            if(j==nums[k]){
37                ans[1]=k;
38                break;
39            }
40        }
41        return ans;
42    }
43}