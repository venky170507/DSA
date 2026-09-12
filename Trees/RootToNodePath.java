package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right =null;}
}

public class RootToNodePath {
    public static boolean getPath(TreeNode node,List<Integer> ans,int val)
    {
        if(node==null) return false;

        ans.add(node.data);
        if(node.data==val) return true;

        if(getPath(node.left, ans, val) || getPath(node.right, ans, val)) return true;

        ans.remove(ans.size()-1);
        return false;
    }
    public static List<Integer> rootTONode(TreeNode root,int val)
    {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        getPath(root, ans, val);
        return ans;
    }
    public static void main(String[] args) {
        TreeNode root=new TreeNode(1);

        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        root.left.right.left=new TreeNode(6);
        root.left.right.right=new TreeNode(7);

        List<Integer> res=rootTONode(root, 7);
        System.out.println(res);
    }
}
