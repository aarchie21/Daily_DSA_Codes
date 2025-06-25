public class LinkedList
{
    private Node head;
    private Node tail;
    private int length;

    class Node
    {
        int value;
        Node next;

        Node(int value)
        {
            this.value=value;
            this.next=null;
        }
    }

    // public LinkedList(int value)
    // {
    //     Node newNode=new Node(value);
    //     head=newNode;
    //     tail=newNode;
    //     length=1;
    // }
    public void printList()
    {
        Node temp=head;
        while (temp!= null)
        {
            System.out.print(temp.value+" -> ");
            temp=temp.next;
        }
        System.out.println("null");
        System.out.println();
    }
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
    public void append(int value)
    {
        Node newNode= new Node(value);
        if(length==0)
        {
            head=newNode;
            tail=newNode;
        }
        else
        {
            tail.next=newNode;
            tail=newNode;
        }
        length++;
    }
    public Node RemoveAtLast()
    {
        Node temp=head;
        Node pre=head;
        if(head==null)
        return null;
        else if(head.next==null)
        {
            head=null;
            return temp;
        }
        else
        {
            
            while(temp.next!=null)
            {
                pre=temp;
                temp=temp.next;
            }
            tail=pre;
            tail.next=null;
            length--;
            if(length==0)
            {
                head=null;
                tail=null;
            }
            return temp; 
                 

        }
    }
    public void prepend(int value)
    {
        Node new_node= new Node(value);
        if(head==null)
        {
            head=new_node;
            tail=new_node;
        }
        else
        {
            new_node.next=head;
            head=new_node;
        }
        length++;
    }
    public Node RemoveAtFirst()
    {
        Node temp=head;
        if(head==null)
        {
            System.out.println("List is empty.");
            return  null;
        }
        else 
        {
            head=head.next;
            temp.next=null;
            length--;
            if(length==0)
            {
                tail=null;
            }
        }
        
        return temp;
    }
    public Node get(int index)
    {
        Node temp=head;
        if(index<0||index>=length)
        {
            return null;
        }
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
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
        if(index==length)
        {
            append(value);
            return true;
        }
        Node newNode=new Node(value);
        Node temp=get(index-1);
        newNode.next=temp.next;
        temp.next=newNode;
        length++;
        return true;
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
        if(index==length-1)
        {
            return RemoveAtLast();
        }
        Node pre=get(index-1);
        Node temp=pre.next;
        pre.next=temp.next;
        temp.next=null;
        length--;
        return temp;
    }
    public void reverse()
    {
        Node temp=head;
        head=tail;
        tail=temp;
        Node after=temp.next;
        Node before=null;
        for(int i=0;i<length;i++)
        {
            after=temp.next;
            temp.next=before;
            before=temp;
            temp=after;
        }

    }
    public Node findKthFromEnd(int k)
    {
        Node temp=head;
        int length=1;
        while(temp.next!=null)
        {
            length++;
            temp=temp.next;
        }
        System.out.println("length"+length);;
        if(k>length) return null;
        return get(length-k,length);
        
    }
    public Node get(int index,int length)
    {
        Node temp=head;
        if(index>=length || index<0) return null;
        for(int i=0;i<index;i++)
        {
            temp=temp.next;
        }
        return temp;
    }

  
    
    
    
}