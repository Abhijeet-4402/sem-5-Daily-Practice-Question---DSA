// Last updated: 30/8/2025, 11:03:06 pm
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
   
    public TreeNode bstFromPreorder(int[] arr) {
        return bst(arr,0,arr.length-1);
        
        
    }
    public static TreeNode bst(int[] arr, int start,int end){
        if(start>=arr.length || end>=arr.length || start>end){
            return null;
        }
        TreeNode nn = new TreeNode(arr[start]);
        int last = find(arr,start);
        nn.left = bst(arr,start+1,last);
        nn.right = bst(arr,last+1,end);
        return nn;
    }

    public static int find(int[] arr, int idx ){
        for(int i=idx;i<arr.length;i++){
            if(arr[i]>arr[idx]){
                return i-1;
            }
        }
        return arr.length-1;
    }
    
}