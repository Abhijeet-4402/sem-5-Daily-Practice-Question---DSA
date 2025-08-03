// Last updated: 4/8/2025, 12:06:52 am
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
			private int max_depth=0;
		    public List<Integer> rightSideView(TreeNode root) {
		        List<Integer>ll=new ArrayList<>();
		        rightView(root, 1, ll);
		        return ll;
		    }
		    private void rightView(TreeNode root,int curr_level,List<Integer>ll) {
		    	if(root==null)return;
		    	if(max_depth<curr_level) {
		    		ll.add(root.val);
		    		max_depth=curr_level;
		    	}
		    	rightView(root.right, curr_level+1,ll);
		    	rightView(root.left, curr_level+1,ll);
		    }
		    
		}