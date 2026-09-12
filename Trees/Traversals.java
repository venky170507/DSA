package Trees;

import java.util.Scanner;

class Traversal
{
    private static class Node
    {
        int value;
        Node left,right;

        public Node(int value)
        {
            this.value=value;
        }
    }

    private Node root;

    public void populate(Scanner scanner)
    {
        System.out.println("Enter the Value of Root Node : ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner, root);
    }

    public void populate(Scanner scanner,Node node)
    {
        System.out.println("Do You Want to insert Left to "+node.value+" (True/False): ");
        boolean left=scanner.nextBoolean();
        if(left)
        {
            System.out.println("Enter the Value to insert to left of "+node.value+" : ");
            int value = scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do You Want to insert Right to "+node.value+" (True/False): ");
        boolean right=scanner.nextBoolean();
        if(right)
        {
            System.out.println("Enter the Value to insert to right of "+node.value+" : ");
            int value = scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    public void InOrder()
    {
        InOrder(root);
        System.out.println();
    }

    public void InOrder(Node node)
    {
        if(node==null) return;

        InOrder(node.left);
        System.out.print(node.value+" ");
        InOrder(node.right);
    }

    public void PreOrder()
    {
        PreOrder(root);
        System.out.println();
    }

    public void PreOrder(Node node)
    {
        if(node==null) return;

        System.out.print(node.value+" ");
        PreOrder(node.left);
        PreOrder(node.right);
    }

    public void PostOrder()
    {
        PostOrder(root);
        System.out.println();
    }

    public void PostOrder(Node node)
    {
        if(node==null) return;

        PostOrder(node.left);
        PostOrder(node.right);
        System.out.print(node.value+" ");
    }

    public void Display()
    {
        Display(this.root,"");
    }

    private void Display(Node node , String indent)
    {
        if(node==null) return;

        System.out.println(indent+node.value);
        Display(node.left,indent+ "\t");
        Display(node.right,indent+ "\t");
    }

}
public class Traversals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Traversal t= new Traversal();

        t.populate(sc);

        System.out.println("In-Order Traversal");
        t.InOrder();

        System.out.println("Pre-Order Traversal");
        t.PreOrder();

        System.out.println("Post-Order");
        t.PostOrder();
    }
}
