package Trees;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) { data = val; left = null; right =null;}
}

public class BoundaryTraversal {
    public static boolean isLeaf(TreeNode node)
    {
        if(node.left==null && node.right==null) return true;
        else return false;
    }
    public static void addLeftElements(TreeNode node , List<Integer> res)
    {
        TreeNode cur=node.left;
        while(cur!=null)
        {
            if(isLeaf(cur)==false) res.add(cur.data);
            if(cur.left!=null) cur=cur.left;
            else cur=cur.right;
        }
    }
    public static void addLeafElements(TreeNode node , List<Integer> res)
    {
        if(isLeaf(node))
        {
            res.add(node.data);
            return;
        }

        if(node.left!=null) addLeafElements(node.left, res);
        if(node.right!=null) addLeafElements(node.right, res);
    }
    public static void addRightElements(TreeNode node , List<Integer> res)
    {
        TreeNode cur=node.right;
        List<Integer> temp=new ArrayList<>();
        while(cur!=null)
        {
            if(isLeaf(cur)==false) temp.add(cur.data);
            if(cur.right!=null) cur=cur.right;
            else cur=cur.left;
        }

        for(int i=temp.size()-1;i>=0;i--)
        {
            res.add(temp.get(i));
        }
    }
    public static List<Integer> boundary(TreeNode root) 
    {
        List<Integer> ans = new ArrayList<>();
        if(root==null) return ans;
        if(isLeaf(root)==false) ans.add(root.data);
        addLeftElements(root, ans);
        addLeafElements(root, ans);
        addRightElements(root, ans);
        return ans;
    }
    public static void main(String[] args) {
       
    }
}
