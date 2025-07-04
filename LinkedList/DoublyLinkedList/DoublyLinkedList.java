public class DoublyLinkedList {
    class Node{
        int value;
        Node next;
        Node prev;

        public Node(int value)
        {
            this.value=value;
            this.next=null;
            this.prev=null;
        }
    }

    private Node head;
    private Node tail;

    private int length;

    public void getHead()
    {
        System.out.println("Head: "+head.value);

    }
    public void getTail()
    {
        System.out.println("tail: "+tail.value);
        
    }
    public void getLength()
    {
        System.out.println("Length: "+length);
        
    }
    public void printList()
    {
        Node temp=head;
        while(temp!=null)
        {
            System.out.print(temp.value+" <=> ");
            temp=temp.next;
            if(temp==null)
            System.out.println("null");

        }
    }
    public void append(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            newNode.prev=tail;
            tail=newNode;
        }
        length++;
    }
    public void prepend(int value)
    {
        Node newNode=new Node(value);
        if(head==null)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            newNode.next=head;
            head.prev=newNode;
            head=newNode;
        }
        length++;
    }
    public Node RemoveAtLast()
    {
        if(head==null)
        {
            return null;
        }
        Node temp=tail;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else
        {
            tail=tail.prev;
            tail.next=null;
            temp.prev=null;
        }
        length--;
        return temp;
        
    }
    public Node RemoveAtFirst()
    {
        if(head==null)
        {
            return null;
        }
        Node temp=head;
        if(length==1)
        {
            head=null;
            tail=null;
        }
        else
        {
            head=head.next;
            head.prev=null;
            temp.next=null;
        }
        length--;
        return temp;
    }
    public Node get(int index)
    {
        if(index<0||index>=length)
        {
            return null;
        }
        Node temp=head;
        if(index<length/2)
        {
            for(int i=0;i<index;i++)
            {

                temp=temp.next;
            }
        }
        else
        {
            temp=tail;
            for(int i=length-1;i>index;i--)
            {
                temp=temp.prev;
            }
        }
        return temp; 
    }
    public boolean set(int index,int value)
    {
        Node temp=get(index);
        if(temp!=null)
        {
            temp.value=value;
            return true;
        }
        return false;
    }
    public boolean insert(int index,int value)
    {
        if(index<0||index>length)
        {
            return false;
        }
        if(index==0)
        {
            prepend(value);
            return true;
        }
        else if(index==length)
        {
            append(value);
            return true;
        }
        else
        {
            Node newNode=new Node(value);
            Node before=get(index-1);
            Node after=before.next;
            newNode.prev=before;
            newNode.next=after;
            before.next=newNode;
            after.prev=newNode;
            length++;
            return true;
        }
    }
    public Node remove(int index)
    {
        if(index<0||index>length)
        {
            return null;
        }
        if(index==0)
        {
            return RemoveAtFirst();
            
        }
        else if(index==length)
        {
            return RemoveAtLast();
        }
        else
        {
            Node temp=get(index);
            temp.prev.next=temp.next;
            temp.next.prev=temp.prev;
            temp.next=null;
            temp.prev=null;
            length--;
            return temp;
        }
    }
}
