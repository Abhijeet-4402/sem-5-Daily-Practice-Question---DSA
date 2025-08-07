// Last updated: 7/8/2025, 12:31:16 pm
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
    public int maxSumBST(TreeNode root) {
        return ValidBst(root).ans;
    }
    public BstPair ValidBst(TreeNode root) {
        if (root == null) return new BstPair();

        BstPair lbp = ValidBst(root.left);
        BstPair rbp = ValidBst(root.right);

        BstPair sbp = new BstPair();

        sbp.sum = root.val+lbp.sum+rbp.sum;

        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
        
        sbp.isbst = lbp.isbst && rbp.isbst && (lbp.max < root.val) && (rbp.min > root.val);

        if(sbp.isbst){
            sbp.ans = Math.max(sbp.sum, Math.max(lbp.ans, rbp.ans));
        }else{
            sbp.ans = Math.max(lbp.ans, rbp.ans);
        }

        return sbp;
    }

    class BstPair {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        int sum = 0;
        int ans = 0; // only maximum bst part ka sum
        boolean isbst = true;
    }
}