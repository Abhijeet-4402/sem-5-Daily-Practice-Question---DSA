// Last updated: 10/2/2026, 11:28:15 am
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    
         private void dfs(TreeNode n1,TreeNode n2,int level){
        if(n1==null || n2==null) return;
        if(level%2!=0){
            int t=n1.val;
            n1.val=n2.val;
            n2.val=t;
        }
        dfs(n1.left,n2.right,level+1);
        dfs(n1.right,n2.left,level+1);
    }
    public TreeNode reverseOddLevels(TreeNode root) {
        dfs(root.left,root.right,1);
        return root;
    }
}