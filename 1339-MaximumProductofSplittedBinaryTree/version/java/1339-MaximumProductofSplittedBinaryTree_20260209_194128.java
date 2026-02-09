// Last updated: 9/2/2026, 7:41:28 pm
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
17    long total;
18    long maxProd;
19    public int maxProduct(TreeNode root) {
20        maxProd = 0;
21        total = findSum(root);
22        solve(root);
23        return (int)(maxProd%1000000007);
24    }
25
26    public long findSum(TreeNode root){
27        if(root == null) return 0;
28        return root.val+findSum(root.left)+findSum(root.right);
29    }
30    public long solve(TreeNode root){
31        if(root == null) return 0;
32        long curr = root.val+solve(root.left)+solve(root.right);
33        maxProd = Math.max(maxProd, curr*(total-curr));
34        return curr;
35    }
36}