// Last updated: 7/8/2025, 12:31:24 pm
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
    private int maxSum = 0;  // Global max sum
    
    public int maxSumBST(TreeNode root) {
        dfs(root);
        return maxSum;
    }
    
    // Returns int array with info about subtree:
    // [0] = isBST? 1 for true, 0 for false
    // [1] = minVal in subtree
    // [2] = maxVal in subtree
    // [3] = sum of subtree
    private int[] dfs(TreeNode node) {
        if (node == null) {
            // For empty node, return isBST=true, min=+inf, max=-inf, sum=0
            return new int[]{1, Integer.MAX_VALUE, Integer.MIN_VALUE, 0};
        }
        
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);
        
        boolean isBST = left[0] == 1 && right[0] == 1 && node.val > left[2] && node.val < right[1];
        
        if (isBST) {
            int sum = left[3] + right[3] + node.val;
            maxSum = Math.max(maxSum, sum);
            
            int minVal = Math.min(node.val, left[1]);
            int maxVal = Math.max(node.val, right[2]);
            return new int[]{1, minVal, maxVal, sum};
        } else {
            return new int[]{0, 0, 0, 0};  // Not a BST
        }
    }
}
