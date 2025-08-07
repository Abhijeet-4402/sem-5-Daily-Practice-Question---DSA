// Last updated: 7/8/2025, 12:32:10 pm
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
    int MAX_SUM = Integer.MIN_VALUE;
    class NodeValue{
        int maxNode, minNode, maxSum; 
        NodeValue(int maxNode, int minNode, int maxSum){
            this.maxNode = maxNode;
            this.minNode = minNode;
            this.maxSum = maxSum;
        }
    }
    // post order (stirver) and logic
    // here negative vlaues can reduce the result if it can make valid BST so better to store MAX
    // SUM at every node in realtime.
    public NodeValue maxSumFind(TreeNode root){
        if(root == null){
            // MIN & MAX not reverse
            return new NodeValue(Integer.MIN_VALUE, Integer.MAX_VALUE, 0);
        }

        NodeValue left = maxSumFind(root.left);
        NodeValue right = maxSumFind(root.right);
        if(left.maxNode < root.val && root.val < right.minNode){
            // Math.min and Math.max
            MAX_SUM = Math.max(MAX_SUM, root.val + left.maxSum + right.maxSum);
            return new NodeValue(
                // remark: max, min, sum
                Math.max(root.val, right.maxNode), Math.min(root.val, left.minNode), root.val + left.maxSum + right.maxSum);            
        }
         // If the current tree is not a BST,
        // return values indicating invalid tree properties
        // instead of Math.max(left.maxSum, right.maxSum) will return 0
        return new NodeValue(Integer.MAX_VALUE, Integer.MIN_VALUE, 0);
    }
    public int maxSumBST(TreeNode root) {
        maxSumFind(root);
        return (MAX_SUM < 0)? 0 : MAX_SUM;
    }
}