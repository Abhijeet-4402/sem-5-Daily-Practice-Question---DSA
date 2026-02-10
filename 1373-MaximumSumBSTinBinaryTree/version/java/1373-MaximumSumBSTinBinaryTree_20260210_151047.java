// Last updated: 10/2/2026, 3:10:47 pm
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    int ans = 0;
18
19    public int maxSumBST(TreeNode root) {
20        solve(root);
21        return ans;
22    }
23
24    private int[] solve(TreeNode root) {
25        if (root == null)
26            return new int[] { Integer.MAX_VALUE, Integer.MIN_VALUE, 0 };
27
28        int[] left = solve(root.left);
29        int[] right = solve(root.right);
30
31        if (root.val <= left[1] || root.val >= right[0])
32            return new int[] { Integer.MIN_VALUE, Integer.MAX_VALUE, 0 };
33
34        int sum = root.val + left[2] + right[2];
35        
36        ans = Math.max(ans, sum);
37
38        int min = Math.min(left[0], root.val);
39        int max = Math.max(right[1], root.val);
40
41        return new int[]{min, max, sum};
42    }
43}
44