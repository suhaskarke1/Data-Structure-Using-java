package Calculator;

class Node1 {
    int data;
    Node1 next;

    public Node1(int data)
    
    {
        this.data = data;
        this.next = null;
    }
}

public class CircularLinkedList

{

    Node1 head;

    public CircularLinkedList()
    {
        head = null;
    }

    public void insertFirst(int data) 
    
    {
        Node1 newNode1 = new Node1(data);

        if (head == null)
        
        {
            head = newNode1;
            newNode1.next = head; 
        } 
        
        else 
        
          { 
            Node1 n = head;
            while (n.next != head) 
            {
                n = n.next;
            }
            newNode1.next = head;
            n.next = newNode1; 
            head = newNode1;
        }
    }

    public void InsertLast(int data)
    
    {
        Node1 newNode = new Node1(data);

        if (head == null) 
        
        {
            head = newNode;
            newNode.next = head; 
        } 
        else 
        
        {
            Node1 n = head;
            while (n.next != head)
            { 
                n = n.next;
            }
            n.next = newNode; 
            newNode.next = head; 
        }
    }

    public void InsertAtPos(int data, int pos)
    {
        int NodeCount = count();

        if (pos < 1 || pos > NodeCount + 1) 
        
        {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1)
        
        {
            insertFirst(data);
        } else if (pos == NodeCount + 1) 
        {
            InsertLast(data);
        } 
        
        else
        {
            Node1 newNode1 = new Node1(data);
            Node1 n = head;

            for (int i = 1; i < pos - 1; i++) 
            {
                n = n.next;
            }

            newNode1.next = n.next;
            n.next = newNode1;
        }
    }

    public void deleteFirst() 
    {
        if (head == null) {
            return;
        } else if (head.next == head)
        { 
            head = null;
        } 
        else 
        {
            Node1 n = head;
            while (n.next != head) 
            { 
                n = n.next;
            }
            n.next = head.next; 
            head = head.next; 
        }
    }

    public void deleteLast() 
    {
        if (head == null)
        {
            return;
        } 
        else if (head.next == head)
        { 
            head = null;
        } 
        else
        {
            Node1 n = head;
            while (n.next.next != head)
            { 
                n = n.next;
            }
            n.next = head; 
        }
    }

    public void deleteAtPos(int pos) 
    {
        int NodeCount = count();

        if (pos < 1 || pos > NodeCount) 
        {
            System.out.println("Invalid Position");
            return;
        }

        if (pos == 1)
        {
            deleteFirst();
        } 
        
        else if (pos == NodeCount)
        {
            deleteLast();
        } 
        
        else
        
        {
            Node1 n = head;

            for (int i = 1; i < pos - 1; i++) 
            {
                n = n.next;
            }

            Node1 free = n.next;
            n.next = free.next; 
        }
    }

    public void Display() 
    {
        if (head == null) 
        {
            System.out.println("List is empty");
            return;
        }

        System.out.println("Elements in Circular Linked List are : ");
        Node1 n = head;
        do 
        
        {
            System.out.printf("| " + n.data + " |->");
            n = n.next;
        } 
        while (n != head);
        System.out.println("(head)"); 
    }

    public int count() 
    
    {
        int cnt = 0;
        if (head == null)
        
        {
            return cnt;
        }

        Node1 n = head;
        do 
        
        {
            cnt++;
            n = n.next;
        }
        while (n != head);
        return cnt;
    }

    public static void main(String[] args) {
    	// TODO Auto-generated method stub
        CircularLinkedList obj = new CircularLinkedList();

        obj.insertFirst(10);
        obj.insertFirst(15);
        obj.insertFirst(20);
        obj.Display();

        int NodeCount = obj.count();
        System.out.println("Number of Node1s are : " + NodeCount);

        obj.InsertLast(200);
        obj.InsertLast(400);
        obj.InsertLast(600);
        obj.Display();

        NodeCount = obj.count();
        System.out.println("Number of Nodes are : " + NodeCount);

        obj.InsertAtPos(105, 5);
        obj.Display();

        obj.deleteAtPos(5);
        obj.Display();

        NodeCount = obj.count();
        System.out.println("Number of Nodes are : " + NodeCount);

        obj.deleteFirst();
        obj.Display();

        NodeCount = obj.count();

        obj.deleteLast();
        obj.Display();

        NodeCount = obj.count();
        System.out.println("Number of Nodes are : " + NodeCount);
    }
}
