package Trees;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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
public class BfsAndDfs {
    public static List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if(root==null) return result;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);

        while(!q.isEmpty())
        {
            int size=q.size();

            List<Integer> level = new ArrayList<>();

            for(int i=0;i<size;i++)
            {
                TreeNode node = q.poll();

                level.add(node.val);

                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            result.add(level);
        }
        return result;
    }
    
    public static void main(String[] args) {
        
    }
}
