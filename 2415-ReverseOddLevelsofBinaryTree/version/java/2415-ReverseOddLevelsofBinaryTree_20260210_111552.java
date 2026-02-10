// Last updated: 10/2/2026, 11:15:52 am
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
17    public TreeNode reverseOddLevels(TreeNode root) {
18
19        Queue<TreeNode> q = new ArrayDeque<>();
20        q.add(root);
21        int level = 0;
22        while(!q.isEmpty()){
23            int size = q.size();
24            ArrayList<TreeNode> nodes = new ArrayList<>();
25            for(int i = 0; i < size; i++){
26                TreeNode node = q.poll();
27                nodes.add(node);
28                if(node.left!=null) q.offer(node.left);
29                if(node.right!=null) q.offer(node.right);
30            }
31
32            if((level&1)==1){
33                int l = 0, r = nodes.size()-1;
34                while(l<r){
35                    int temp = nodes.get(l).val;
36                    nodes.get(l).val = nodes.get(r).val;
37                    nodes.get(r).val = temp;
38                    l++;
39                    r--;
40                }
41            }
42            level++;
43        }
44        return root;
45    }
46}