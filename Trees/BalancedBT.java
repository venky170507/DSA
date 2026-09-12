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

public class BalancedBT {
    public static int check(TreeNode root)
    {
        if(root==null) return 0;

        int lh=check(root.left);
        int rh=check(root.right);

        if(lh==-1 || rh==-1) return -1;
        if(Math.abs(rh-lh)>1) return -1;

        return 1+Math.max(lh, rh);
    }
    public static boolean isBalanced(TreeNode root) {
        return check(root)!=-1;
    }
    public static void main(String[] args) {
        
    }   
}
