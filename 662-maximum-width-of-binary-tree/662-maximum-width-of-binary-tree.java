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
        LinkedList<Integer> queueIndex = new LinkedList<>();
        queue.add(root);
        queueIndex.add(1);
        int size;
        int width = 1;
        while(!queue.isEmpty()){
            size = queue.size();
            int start = 0;
            int end = 0;
            for(int i = 0; i < size; i++){
                TreeNode node = queue.poll();
                int index = queueIndex.poll();
                if(i == 0) start = index;
                if(i == size - 1) end = index;
                if(node.left != null){
                    queueIndex.add(2 * index);
                    queue.add(node.left);
                }
                if(node.right != null) {
                    queueIndex.add(2 * index + 1);
                    queue.add(node.right);
                }
            }
            
            width = Math.max(width, end - start + 1);
            
        }
        
        return width;
    }
}