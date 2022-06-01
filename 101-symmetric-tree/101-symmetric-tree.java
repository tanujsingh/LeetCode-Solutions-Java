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
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        
        return isSubTreeSymmetric(root.left, root.right);
    }
    
    private boolean isSubTreeSymmetric(TreeNode left, TreeNode right) {
        if(left == null || right == null) {
            return left == right;
        }
        
        if(left.val != right.val) {
            return false;
        }
        
        return isSubTreeSymmetric(left.left, right.right) && isSubTreeSymmetric(left.right, right.left);
        
    }
}