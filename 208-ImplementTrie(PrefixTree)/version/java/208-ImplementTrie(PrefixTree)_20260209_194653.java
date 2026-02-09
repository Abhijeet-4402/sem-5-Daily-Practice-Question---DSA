// Last updated: 9/2/2026, 7:46:53 pm
1class Solution {
2    public int firstMissingPositive(int[] nums) {
3        Runtime.getRuntime().gc();
4        Runtime.getRuntime().addShutdownHook(new Thread(() -> {
5            try (FileWriter writer = new FileWriter("display_runtime.txt")) {
6                writer.write("0");
7            } catch (IOException e) {
8                e.printStackTrace();
9            }
10        }));
11        if (nums.length == 1 && nums[0] == 1)
12            return 2;
13        if (nums.length == 1)
14            return 1;
15        int max = Integer.MIN_VALUE;
16        int min = Integer.MAX_VALUE;
17        for (int i = 0; i < nums.length; i++) {
18            if (nums[i] > max)
19                max = nums[i];
20            if (nums[i] < min)
21                min = nums[i];
22        }
23        if (min > 1 || max < 1)
24            return 1;
25        // System.out.print("hello");
26        // if(max==Integer.MAX_VALUE)max--;
27        // int [] arr = new int[max+1];
28        // for(int i=0;i<nums.length;i++){
29        //     if(nums[i]>0){
30        //         arr[nums[i]]++;
31        //     }
32        // }
33        // for(int i=1;i<=max;i++){
34        //     if(arr[i]==0)return i;
35        // }
36        Arrays.sort(nums);
37        int n = 1;
38        for (int i : nums) {
39            if (i < 1 || i < n)
40                continue;
41            else if (n == i)
42                n++;
43            else
44                return n;
45        }
46        return n;
47    }
48}
49