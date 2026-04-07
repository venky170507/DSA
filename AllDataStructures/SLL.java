package AllDataStructures;


class Node
{
    int data;
    Node next;

    public Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

class SinglyLinkedList
{
    Node head ;

    public void Insert_At_the_Head(int data)
    {
        Node newNode = new Node(data);
        newNode.next=head;
        head=newNode;
    }

    public void Insert_At_the_Last(int data)
    {
        Node newNode = new Node(data);

        if(head==null)
        {
            head=newNode;
            return;
        }

        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }

        temp.next=newNode;
    }

    public void Delete_At_Index(int index)
    {
        if(head==null)
        {
            System.out.println("List is Empty");
            return;
        }

        if(index==0)
        {
            head=head.next;
            return;
        }

        Node temp=head;

        for(int i=0;i<index-1;i++)
        {
            if(temp.next==null)
            {
                System.out.println("Index out of bounds!");
                return;
            }
            temp=temp.next;
        }

        temp.next=temp.next.next;
    }

    public void Display()
    {
        Node temp=head;

        while(temp!=null)
        {
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println("NULL");
    }
}
public class SLL {
    public static void main(String[] args) {
        SinglyLinkedList s=new SinglyLinkedList();
        s.Insert_At_the_Head(23);
        s.Insert_At_the_Last(43);
        s.Insert_At_the_Head(2);
        s.Delete_At_Index(0);
        s.Display();
    }
}
