public class Stack {
    private Node top;
    private int height;
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
    public Stack()
    {
        top=null;
        height=0;
    }
    public void printStack()
    {
        Node temp=top;
        while(temp!=null)
        {
            System.out.println(temp.value);
            temp=temp.next;
        }
    }
    public void getHeight()
    {
        System.out.println("Height: "+height);
    }
    public void getTop()
    {
        System.out.println("Top: "+top.value);
    }
    public void push(int value)
    {
        Node newNode= new Node(value);
        if(height==0)
        {
            top=newNode;
        }
        else
        {
            newNode.next=top;
            top=newNode;
        }
        height++;
    }
    public Node pop()
    {
        if(height==0) return null;
        Node temp=top;
        top=top.next;
        temp.next=null;
        height--;
        return temp;
    }
}