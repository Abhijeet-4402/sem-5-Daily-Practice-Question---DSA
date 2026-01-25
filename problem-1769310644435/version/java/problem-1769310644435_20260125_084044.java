// Last updated: 25/1/2026, 8:40:44 am
1class Solution {
2
3    public int[] rotateElements(int[] nums, int k) {
4        ArrayList<Integer> index = new ArrayList<>();
5        ArrayList<Integer> value = new ArrayList<>();
6
7        for (int i = 0; i < nums.length; i++) {
8            if (nums[i] >= 0) {
9                value.add(nums[i]);
10                index.add(i);
11            }
12        }
13
14        if (value.size() == 0)
15            return nums;
16        rotate(value, k);
17
18        for (int i = 0; i < value.size(); i++) {
19            nums[index.get(i)] = value.get(i);
20        }
21        return nums;
22    }
23
24    private void rotate(ArrayList<Integer> ll, int k) {
25        int n = ll.size();
26        k = k % n;
27        if (k == 0)
28            return;
29        reverse(ll, 0, k - 1);
30        reverse(ll, k, n - 1);
31        reverse(ll, 0, n - 1);
32    }
33
34    private void reverse(ArrayList<Integer> ll, int st, int end) {
35        while (st < end) {
36            int temp = ll.get(st);
37            ll.set(st, ll.get(end));
38            ll.set(end, temp);
39            st++;
40            end--;
41        }
42    }
43
44}