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
    public int widthOfBinaryTree(TreeNode root) {
        if(root == null) return 0;
        
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        root.val = 0;
        int size;
        int width = 1;
        while(!queue.isEmpty()){
            size = queue.size();
            width = Math.max(width, queue.peekLast().val - queue.peekFirst().val + 1);
            // System.out.println(queue.peekLast().val + " " + queue.peekFirst().val);
            for(int i = 0; i < size; i++){
                root = queue.poll();
                
                if(root.left != null){
                    root.left.val = 2 * root.val;
                    queue.add(root.left);
                }
                if(root.right != null) {
                    root.right.val = 2 * root.val + 1;
                    queue.add(root.right);
                }
            }
            
            
        }
        
        return width;
    }
}