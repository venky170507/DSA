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

public class MaxPathSum {
    public static int maxPathSum(TreeNode root) {
        int[] sum=new int[1];
        sum[0]=Integer.MIN_VALUE;
        maxPathDown(root, sum);
        return sum[0];
    }

    public static int maxPathDown(TreeNode root , int[] sum)
    {
        if(root==null) return 0;

        int left=maxPathDown(root.left, sum);
        int right=maxPathDown(root.right, sum);
        if(left<0) left=0;
        if(right<0) right=0;
        sum[0]=Math.max(sum[0], left+right+root.val);
        return root.val+Math.max(left, right);
    }
    public static void main(String[] args) {
        TreeNode root  = new TreeNode(-10);

        root.left=new TreeNode(9);

        root.right=new TreeNode(20);
        root.right.left= new TreeNode(15);
        root.right.right=new TreeNode(7);

        int ans = maxPathSum(root);
        System.out.println(ans); 
    }
}
