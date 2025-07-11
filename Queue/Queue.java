public class Queue
{
    private Node first;
    private Node last;
    private int length;
   class Node
   {
    int value;
    Node next;
    Node(int value)
    {
        this.value = value;
        this.next = null;
    }
   }
   public Queue()
   {
       first = null;
       last = null;
       length=0;
   }
    public void printQueue()
    {
         Node temp = first;
         while(temp != null)
         {
              System.out.println(temp.value);
              temp = temp.next;
         }
    }
    public void getLength()
    {
        System.out.println("Length: " + length);
    }  
    public void getFirst()
    {
        if(first != null)
            System.out.println("First: " + first.value);
        else
            System.out.println("Queue is empty");
    }
    public void getLast()
    {
        if(last != null)
            System.out.println("Last: " + last.value);
        else
            System.out.println("Queue is empty");
    }
   public void enqueue(int value)
   {
        Node newNode= new Node(value);
        if(length==0)
        {
            first=newNode;
            last=newNode;
        }
        else
        {
            last.next = newNode;
            last = newNode;
        }
        length++;
   }
   public Node dequeue()
   {
    if(length==0)
    {
        return null;
    }
    Node temp=first;
    first=temp.next;
    temp.next=null;
    length--;
    return temp;    
   }
}