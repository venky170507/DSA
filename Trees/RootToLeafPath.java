package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right =null;}
}

public class RootToLeafPath {
    public static boolean isLeaf(TreeNode node)
    {
        return node.left==null && node.right==null;
    }
    public static void helper(TreeNode node,List<Integer> path,List<List<Integer>> ans)
    {
        if(node==null) return;
        
        path.add(node.data);
        if(isLeaf(node))
        {
            ans.add(new ArrayList<>(path));
        }
        else
        {
            helper(node.left, path, ans);
            helper(node.right, path, ans);
        }

        path.remove(path.size()-1);
    }
    public static List<List<Integer>> allRootToLeaf(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root==null) return ans;
        helper(root,new ArrayList<>(), ans);
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

        List<List<Integer>> res=allRootToLeaf(root);
        System.out.println(res);
    }   
}
