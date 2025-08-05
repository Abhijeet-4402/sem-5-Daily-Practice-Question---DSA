// Last updated: 5/8/2025, 9:35:26 pm
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
    public boolean isValidBST(TreeNode root) {
        return ValidBst(root).isbst;
    }

    public BstPair ValidBst(TreeNode root) {
        if (root == null) return new BstPair();

        BstPair lbp = ValidBst(root.left);
        BstPair rbp = ValidBst(root.right);

        BstPair sbp = new BstPair();  // Fixed this line

        sbp.min = Math.min(root.val, Math.min(lbp.min, rbp.min));
        sbp.max = Math.max(root.val, Math.max(lbp.max, rbp.max));
        sbp.isbst = lbp.isbst && rbp.isbst && (lbp.max < root.val) && (rbp.min > root.val);

        return sbp;
    }

    class BstPair {
        long min = Long.MAX_VALUE;
        long max = Long.MIN_VALUE;
        boolean isbst = true;
    }
}
