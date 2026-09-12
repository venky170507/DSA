package Trees;

import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.List;
// import java.util.Queue;

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

public class RightSideView {
    // public List<Integer> rightSideView(TreeNode root) {
    //     List<Integer> res = new ArrayList<>();

    //     if(root==null) return res;
    //     res.add(root.val);

    //     Queue<TreeNode> q = new LinkedList<>();
    //     q.offer(root);

    //     while (!q.isEmpty()) 
    //     {
    //         int size=q.size();
    //         res.add(((LinkedList<TreeNode>) q).peekLast().val);

    //         for(int i=0;i<size;i++)
    //         {
    //             TreeNode node = q.poll();

    //             if(node.left!=null) q.add(node.left);
    //             if(node.right!=null) q.add(node.right);
    //         }
    //     }
    //     return res;
    // }
    List<Integer> res = new ArrayList<>();
    public void dfs(TreeNode node , int level)
    {
        if(node==null) return;
        if(res.size()==level) res.add(node.val);
        dfs(node.right, level+1);
        dfs(node.left, level+1);
    }
    public List<Integer> rightSideView(TreeNode root) {
        dfs(root, 0);
        return res;
    }
    public static void main(String[] args) {
        
    }
}
