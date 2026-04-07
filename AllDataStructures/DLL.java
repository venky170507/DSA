package AllDataStructures;


class DNode
{
    int data;
    DNode next , prev;

    public DNode(int data)
    {
        this.data=data;
        this.next=null;
        this.prev=null;
    }
}

class DoublyLinkedList
{
    DNode head;

    public void Insert_At_Head(int data)
    {
        DNode newNode = new DNode(data);

        if(head!=null)
        {
            head.prev=newNode;
            newNode.next=head;
        }

        head=newNode;
    }

    public void Insert_At_Last(int data)
    {
        DNode newNode = new DNode(data);

        if(head==null)
        {
            head=newNode;
            return;
        }

        DNode temp=head;

        while (temp.next!=null) 
        {
            temp=temp.next;    
        }

        temp.next=newNode;
        newNode.prev=temp;
    }

    public void Inset_At_Middle(int index,int data)
    {
        
        if(index==0)
        {
            Insert_At_Head(data);
            return;
        }

        DNode newNode=new DNode(data);

        DNode temp=head;

        for(int i=0;i<index-1;i++)
        {
            if(temp==null)
            {
                System.out.println("Index out if bound!");
                return;
            }
            temp=temp.next;
        }

        if(temp == null)
        {
            System.out.println("Index out of bound!");
            return;
        }

        newNode.next=temp.next;
        newNode.prev=temp;

        if(temp.next!=null)
        {
            temp.next.prev=newNode;
        }

        temp.next=newNode;
    }
    public void DeleteAtIndex(int index)
{
    if(head==null)
    {
        System.out.println("List is Empty!");
        return;
    }

    if(index==0)
    {
        head=head.next;
        if(head!=null) head.prev=null;
        return;
    }

    DNode temp=head;

    // go to (index-1)
    for(int i=0;i<index-1;i++)
    {
        if(temp==null)
        {
            System.out.println("Index Out of Bounds!");
            return;
        }
        temp=temp.next;
    }

    if(temp==null || temp.next==null)
    {
        System.out.println("Index Out of Bounds!");
        return;
    }

    DNode nodeToDelete = temp.next;

    temp.next = nodeToDelete.next;

    if(nodeToDelete.next!=null)
    {
        nodeToDelete.next.prev = temp;
    }
}
    public void Display()
    {
        if(head==null)
        {
            System.out.println("List is Empty!");
            return;
        }
        DNode temp=head;
        while (temp!=null) 
        {
            System.out.print(temp.data+" <-> ");
            temp=temp.next;    
        }
        System.out.println("NULL");
    }
}
public class DLL {
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();

        dll.Display();
    }
}   
