// Last updated: 8/2/2026, 2:24:23 pm
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
17    public boolean isBalanced(TreeNode root) {
18        return isBalance(root).isBal;
19    }
20    public BalancePair isBalance(TreeNode root){
21        if(root== null){
22            return new BalancePair();
23        }
24        BalancePair lbp = isBalance(root.left);
25        BalancePair rbp = isBalance(root.right);
26        BalancePair sbp = new BalancePair();
27        sbp.ht= Math.max(lbp.ht,rbp.ht)+1;
28        boolean sb = Math.abs(lbp.ht-rbp.ht)<=1;
29        sbp.isBal=lbp.isBal && rbp.isBal && sb;
30        return sbp;
31    }
32    class BalancePair{
33        boolean isBal = true;
34        int ht=-1;
35    }
36}