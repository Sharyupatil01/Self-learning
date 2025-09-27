class Node{
    int data;
    Node next;
    Node(int data)
    {
       this.data=data;
       this.next=null;
    }
}


class LinkedList1
{
    Node head;
    void insert(int data)
    {
        Node newnode=new Node(data);
        if(head==null)
        {
            head=newnode;
            //return;
            return;
        }
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
            
        }
        temp.next=newnode;

        


    }
    void display()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.data +"->");
            temp=temp.next;


        }
        System.out.println("null");
    }
}


public class LinkedListExample {
    public static void main(String args[])
    {
        LinkedList1 ll=new LinkedList1();
        ll.insert(10);
        ll.insert(20);
        ll.insert(30);
        
        ll.display();
    }
}
