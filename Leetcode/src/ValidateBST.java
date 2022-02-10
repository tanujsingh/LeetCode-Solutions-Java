
public class ValidateBST {
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
		ValidateBST tree=new ValidateBST();
		TreeNode root=tree.new TreeNode(5);
        root.left=tree.new TreeNode(1);
        root.right=tree.new TreeNode(4);
        root.left.left=tree.new TreeNode(1);
        root.left.right=tree.new TreeNode(3);
        System.out.println(tree.isValidBST(root));
	}
	public boolean isValidBST(TreeNode root) {
        return isBinaryTree(root,null,null);
    }
    private boolean isBinaryTree(TreeNode root,Integer lowerBound,Integer upperBound) {
        if(root==null)return true;
        if(lowerBound!=null&&root.val<=lowerBound)return false;
        if(upperBound!=null&&root.val>=upperBound)return false;
        return isBinaryTree(root.left,lowerBound,root.val)&&isBinaryTree(root.right,root.val,upperBound);
    }
}
