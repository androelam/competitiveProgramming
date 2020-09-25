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
        return isBstUtil(root, null, null);
    }
    
    private boolean isBstUtil(TreeNode root, Integer min, Integer max) {
        if(root == null) {
            return true;
        }
        if(max != null && root.val >= max || min != null && root.val <= min) {
            return false;
        }
        
        return isBstUtil(root.left, min, root.val) && isBstUtil(root.right, root.val, max);
    }
}