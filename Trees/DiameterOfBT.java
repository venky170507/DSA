package Trees;

class TreeNode {
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

public class DiameterOfBT {
   
    public static int checkHeight(TreeNode root , int[] diameter)
    {
        if(root==null) return 0;

        int lh=checkHeight(root.left, diameter);
        int rh=checkHeight(root.right, diameter);

        diameter[0]=Math.max(diameter[0], rh+lh);

        return 1+Math.max(lh, rh);
    }
    public static int diameterOfBinaryTree(TreeNode root) {
        int[] diameter = new int[1];
        checkHeight(root, diameter);
        return diameter[0]; 
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);

        root.left=new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.right.left=new TreeNode(6);

        int ans=diameterOfBinaryTree(root);
        System.out.println(ans);
    }
}
