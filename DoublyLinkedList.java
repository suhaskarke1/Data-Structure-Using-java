package Calculator;

class Node2


{
    int data;
    Node2 next;
    Node2 prev;

    Node2(int data)
    {
        this.data = data;
        this.next = null;
        this.prev = null;
    }
}

class DoublyLinkedList
{
     Node2 head;

   
    public void insertFirst(int no)
    {
        Node2 newn = new Node2(no);

        if (head == null) 
        {
            head = newn;
        } 
        else
        {
            newn.next = head;
            head.prev = newn;
            head = newn;
        }
    }

    
    public void insertLast(int no)
    
    {
        Node2 newn = new Node2(no);

        if (head == null)
        
        {
            head = newn;
        } 
        
        else 
        
        {
            Node2 n = head;
            while (n.next != null) 
            {
                n = n.next;
            }
            n.next = newn;
            newn.prev = n;
        }
    }

   
    
   
    public void deleteFirst() 
    
    {
        if (head == null) return; 
        else if (head.next == null) 
        {
            head = null;
        } 
        else
        { 
            head = head.next;
            head.prev = null;
        }
    }

    
    public void deleteLast() 
    {
        if (head == null) return; 
        else if (head.next == null) 
        {
            head = null;
        } 
        else 
        { 
            Node2 n = head;
            while (n.next.next != null) 
            {
                n = n.next;
            }
            n.next = null;
        }
    }


    public void insertAtPos(int no, int pos) 
    
    {
        int nodeCount = count();

        if (pos < 1 || pos > nodeCount + 1) 
        
        {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) 
        {
            insertFirst(no);
        } 
        
        else if (pos == nodeCount + 1)
        {
            insertLast(no);
        }
        else 
        
        {
            Node2 newn = new Node2(no);
            Node2 n = head;

            for (int i = 1; i < pos - 1; i++) 
            {
                n = n.next;
            }

            newn.next = n.next;
            n.next.prev = newn;
            n.next = newn;
            newn.prev = n;
        }
    }

    
    public void deleteAtPos(int pos) 
    
    {
        int nodeCount = count();

        if (pos < 1 || pos > nodeCount) 
        
        {
            System.out.println("Invalid position");
            return;
        }

        if (pos == 1) {
            deleteFirst();
        } 
        
        else if (pos == nodeCount) 
        {
            deleteLast();
        } 
        else 
        
        {
            Node2 n = head;

            for (int i = 1; i < pos - 1; i++)
            {
                n = n.next;
            }

            Node2 temp = n.next;
            n.next = temp.next;
            temp.next.prev = n;
        }
    }


    public void display() 
    {
        System.out.print("Elements of Linked list are\nNULL<=> ");
        Node2 n = head;
        while (n != null)
        
        {
            System.out.print("| " + n.data + " |<=> ");
            n = n.next;
        }
        System.out.println("NULL");
    }


    public int count() 
    
    {
        int count = 0;
        Node2 n = head;
        while (n != null) 
        
        {
            count++;
            n = n.next;
        }
        return count;
    }


    public static void main(String[] args) {
    	// TODO Auto-generated method stub
    	
    	DoublyLinkedList dll = new DoublyLinkedList();

        dll.insertFirst(51);
        dll.insertFirst(21);
        dll.insertFirst(11);
        dll.display();
        int iRet = dll.count();
        System.out.println("Number of elements are : " + iRet);

        dll.insertLast(101);
        dll.insertLast(111);
        dll.insertLast(121);
        dll.display();
        iRet = dll.count();
        System.out.println("Number of elements are : " + iRet);

        dll.insertAtPos(105, 5);
        dll.display();
        iRet = dll.count();
        System.out.println("Number of elements are : " + iRet);

        dll.deleteAtPos(5);
        dll.display();
        iRet = dll.count();
        System.out.println("Number of elements are : " + iRet);

        dll.deleteFirst();
        dll.deleteLast();

        dll.display();

        iRet = dll.count();
        System.out.println("Number of elements are : " + iRet);
    }
}
