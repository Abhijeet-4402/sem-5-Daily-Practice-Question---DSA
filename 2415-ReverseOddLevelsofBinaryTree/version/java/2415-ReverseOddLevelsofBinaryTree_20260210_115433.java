// Last updated: 10/2/2026, 11:54:33 am
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
17    public int maxSumBST(TreeNode root) {
18        return ValidBst(root).ans;
19    }
20    public BstPair ValidBst(TreeNode root) {
21        if (root == null) return new BstPair();
22
23        BstPair lbp = ValidBst(root.left);
24        BstPair rbp = ValidBst(root.right);
25
26        BstPair sbp = new BstPair();
27
28        sbp.sum = root.val+lbp.sum+rbp.sum;
29
30        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
31        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
32        
33        sbp.isbst = lbp.isbst && rbp.isbst && (lbp.max < root.val) && (rbp.min > root.val);
34
35        if(sbp.isbst){
36            sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
37        }else{
38            sbp.ans = Math.max(lbp.ans, rbp.ans);
39        }
40
41        return sbp;
42    }
43
44    class BstPair {
45        long min = Long.MAX_VALUE;
46        long max = Long.MIN_VALUE;
47        int sum = 0;
48        int ans = 0; // only maximum bst part ka sum
49        boolean isbst = true;
50    }
51}