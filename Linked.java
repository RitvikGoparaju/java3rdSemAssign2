package pkg3rdsem.assign2;

// Roll Number : IMT2015047
class LinkedList
{
    Node head;
    Node last;
    class Node
    {
        Node next;
        int data;
        public Node(int x)
        {
            data = x;
        }
    }
    void add(int x)
    {
        Node n = new Node(x);
        if(head == null)
        {
            head = n;
            last = n;
            n.next = null;
        }
        else
	{
            last.next = n;
            last = n;
            n.next = null;
        }
    }
    void delete(int y)
    {
        Node n = new Node(y);
        Node n1 = head;
        while(n1 != null)
	{
            if(n.data == n1.next.data)
	    {
                n1.next = n1.next.next;
                break;
            }
            n1 = n1.next;
        }
    }

    boolean search(int z)
    {
        Node node = new Node(z);
        if(head == null)
	{
            return false;
        }
        else
	{
            Node node1 = head;
            while(node1 != null)
	    {
                if(node.data == node1.data)
		{
                    return true;
                }
                node1 = node1.next;
            }
            return false;
        }
    }
    void display()
    {
        Node n = head;
        while(n!=null)
	{
            System.out.println(n.data);
            n = n.next;
        }
    }
}

/**
 *This class is for linked lists
 * @author GVKC Ritvik, IIIT - Bengaluru
 */
public class Linked
{

    /**
     *This method is the main method which runs the program
     * @param args Default arguments
     */
    public static void main(String[] args)
    {
        LinkedList ll = new LinkedList();
        ll.add(0);
        ll.add(2);
        ll.add(1);
        ll.add(3);
        ll.add(19);
        System.out.println("Before deleting the elements.");
        ll.display();
        ll.delete(3);
        System.out.println("After deleting  the elements.");
        ll.display();
        System.out.println("Searching for 2 :"+ll.search(2));
        System.out.println("Searching for 6 :"+ll.search(6));
    }
}
