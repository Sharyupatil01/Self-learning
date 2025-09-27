class MyNode
{
    int data;
    MyNode next;
    MyNode(int data)
    {
        this.data=data;
        this.next=null;
    }
}
class praticeLL{
   Node head;

   //add the the beginning of ll 
   void insert(int data)
   {
    Node newnode=new Node(data);
    newnode.next=head;
    head=newnode;

   }
   void insertAtEnd(int data)
   {
    Node temp=head;
    Node newnode=new Node(data);
    if(head==null)
    {
         head=newnode;
         return;
    }
    while(temp.next!=null)
    {
        temp=temp.next;
    }
    temp.next=newnode;
   }
   void deleteAtEnd()
   {
      if(head==null)
      {
        System.out.println("LL IS EMPTY ");
        return;
      }
      
      head=head.next;
      return;
      

   }

   void DeleteatEnd()
   {
    if(head==null)
    {
        return;
    }
    Node temp=head;
    while(temp.next.next!=null)
    {
        temp=temp.next;
    }
    temp.next=null;

   }
   void insert(int data,int pos)
   {
       Node temp=head;
       if(pos<=0)
       {
        System.out.println("invalid position");
       }
       if(pos==1)
       {
          insert(data);
       }
       Node newnode=new Node(data);
       for(int i=1;temp.next!=null && i<pos-1;i++)
       {
          temp=temp.next;
       }
       newnode.next=temp.next;
       temp.next=newnode;
   }

   boolean search(int key)
   {
       Node temp=head;
       if(head==null)
       {
        return false;
       }
       while(temp!=null)
       {
        if(temp.data==key)
        {
            return true;
        }
        temp=temp.next;
       }
       return false;
   }

   void display(Node head)
   {
    Node temp=head;
    while(temp!=null)
    {
        System.out.print(temp.data+"->");
        temp=temp.next;
    }
    System.out.println("null");
   }
   void reverse()
   {
      Node prev=null;
      Node curr=head;
      Node next=head;
      while(curr!=null)
      {
        next=curr.next;
        curr.next=prev;
        prev=curr;
        curr=next;
      }
      head=prev;




   }



}


class OperationsOnLL
{
    public static void main(String args[])
    {
       praticeLL ll=new praticeLL();
         ll.insert(10);
            ll.insert(20);
            ll.insert(30);
            ll.insertAtEnd(40);
            ll.insertAtEnd(50);
            ll.insert(25,3);
            ll.display(ll.head);
            System.out.println(ll.search(30));
            ll.deleteAtEnd();
            ll.display(ll.head);
            ll.DeleteatEnd();
            ll.display(ll.head);
            ll.reverse();
            ll.display(ll.head);

    }
}