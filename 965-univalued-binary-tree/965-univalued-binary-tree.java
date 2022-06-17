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
    public boolean isUnivalTree(TreeNode root) {
        if(root.left != null) {
            if(!isUnivalTree(root.left)) {
                return false;
            }
            if(root.left.val != root.val){
                return false;
            }
        }
          if(root.right != null) {
            if(!isUnivalTree(root.right)) {
                return false;
            }
            if(root.right.val != root.val){
                return false;
            }
        }
        return true;
    }
}