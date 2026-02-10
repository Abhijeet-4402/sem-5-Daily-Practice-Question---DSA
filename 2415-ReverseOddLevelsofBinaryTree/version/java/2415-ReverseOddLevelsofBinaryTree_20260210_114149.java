// Last updated: 10/2/2026, 11:41:49 am
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
17    public boolean isEvenOddTree(TreeNode root) {
18        if (root == null)
19            return true;
20
21        Queue<TreeNode> q = new LinkedList<>();
22        q.offer(root);
23        int level = 0;
24
25        while (!q.isEmpty()) {
26            int size = q.size();
27            int prev = (level % 2 == 0) ? Integer.MIN_VALUE : Integer.MAX_VALUE;
28
29            for (int i = 0; i < size; i++) {
30                TreeNode nn = q.poll();
31                int curr = nn.val;
32
33                if (level % 2 == 0) {
34                    if (curr % 2 == 0 || curr <= prev)
35                        return false;
36                } else {
37                    if (curr % 2 != 0 || curr >= prev)
38                        return false;
39                }
40                prev = curr;
41                if (nn.left != null)
42                    q.offer(nn.left);
43                if (nn.right != null)
44                    q.offer(nn.right);
45            }
46            level++;
47        }
48        return true;
49    }
50}