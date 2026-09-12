package Trees;

import java.util.Scanner;

class BinaryTree
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
        System.out.println("Enter the root Node: ");
        int value=scanner.nextInt();
        root=new Node(value);
        populate(scanner,root);
    }

    private void populate(Scanner scanner,Node node)
    {
        System.out.println("Do You want to Insert Left to "+node.value+" (true/false): ");
        boolean left=scanner.nextBoolean();

        if(left)
        {
            System.out.println("Enter the value of left of "+node.value+" : ");
            int value =scanner.nextInt();
            node.left=new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("Do You Want to Insert right to "+node.value+" (true/false) : ");
        boolean right = scanner.nextBoolean();

        if(right)
        {
            System.out.println("Enter the value of right of "+node.value+" : ");
            int value=scanner.nextInt();
            node.right=new Node(value);
            populate(scanner, node.right);
        }
    }

    public void display()
    {
        display(this.root,"");
    }

    private void display(Node node , String indent)
    {
        if(node==null) return;

        System.out.println(indent+node.value);
        display(node.left,indent+ "\t");
        display(node.right,indent+ "\t");

    }
}

public class BTImplementation {
    public static void main(String[] args) {
        BinaryTree bt=new BinaryTree();
        Scanner sc=new Scanner(System.in);

        bt.populate(sc);
        bt.display();
    }
}
