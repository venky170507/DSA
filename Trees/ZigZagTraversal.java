package Trees;

import java.util.ArrayList;
import java.util.Collections;
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

public class ZigZagTraversal {
    public static List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        
        if(root==null) return ans;

        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        int flag=0;

        while (!q.isEmpty()) 
        {
            List<Integer> level=new ArrayList<>();
            
            int size=q.size();

            for(int i=0;i<size;i++)
            {
                TreeNode node=q.poll();

                level.add(node.val);
                
                if(node.left!=null) q.add(node.left);
                if(node.right!=null) q.add(node.right);
            }

            if(flag==1)
            {
                Collections.reverse(level);
            }

            ans.add(level);
            flag=1-flag;
        }
        return ans;
    }
    public static void main(String[] args) {
        
    }
}
