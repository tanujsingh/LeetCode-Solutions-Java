public class FlattenBinaryTreeToLinkedList {
	public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//[1,2,5,3,4,null,6]
		FlattenBinaryTreeToLinkedList tree=new FlattenBinaryTreeToLinkedList();
		TreeNode root=tree.new TreeNode(1);
        root.left=tree.new TreeNode(2);
        root.right=tree.new TreeNode(5);
        root.left.left=tree.new TreeNode(3);
        root.left.right=tree.new TreeNode(4);
        root.right.right=tree.new TreeNode(6);
        tree.flatten(root);
	}
	
	public void flatten(TreeNode root) {
		if(root==null)return;
		TreeNode node=root;
		while(node!=null) {
			if(node.left!=null) {
				TreeNode rightmost=node.left;
				while(rightmost.right!=null) {
					rightmost=rightmost.right;
				}
				rightmost.right=node.right;
				node.right=node.left;
				node.left=null;
			}
			System.out.println(node.val + " ");
			node=node.right;
		}
	}

}
