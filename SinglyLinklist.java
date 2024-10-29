package Calculator;

	class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
		
	}
		public class SinglyLinklist {
			
			Node head;
			public SinglyLinklist()
			{
				head =null;
			}
			
			public void insertFirst(int data)
			{
				Node newnode = new Node(data);
				
				if(head == null)
				{
					head =newnode;
				}
				else
				{
					newnode.next =head;
					head =newnode;
				}
			}
			
			public void InsertLast(int data)
			{
				Node  newnode = new Node(data);
				
				if(head == null)
				{
					head = newnode;
					
				}
				else
				{
					Node n = head;
					while(n.next != null)
					{
						n =n.next;
					}
					n.next =newnode;
				}
			}
			
			public void InseartAtPos(int data,int pos)
			{
				int nodecount = count();
				
				if(pos < 1 || pos > nodecount+1)
				{
					System.out.println("Invalid Position");
				     return ;
				} 
				
				if(pos ==1)
				{
					insertFirst(data);
					
				}
				else if(pos == nodecount +1)
				{
					InsertLast(data);
				}
				else
				{
					Node newnode = new Node(data);
					Node n = head;
					
					for(int i =1; i < pos -1;i++)
					{
						n = n.next;
						
					}
					
					newnode.next =n.next;
					n.next = newnode;
				}
			}
			
			public void deleteFirst()
			{
				if(head == null)
				{
					return;
					
				}
				else if(head.next == null)
				{
					head = null;
				}
				else
				{
					head = head.next;
				}
			}
			
			public void deleteLast()
			{
				if (head == null)
				{
					return;
				}
				else if(head.next == null)
				{
					head = null;
				}
				else
				{
					Node n = head;
					
					while(n.next.next!=null)
					{
						n= n.next;
					}
					n.next = null;
				}
				
			}
			
			public void deleteAtpos(int pos)
			{
				int nodeCount = count();
				
				if(pos < 1 || pos > nodeCount)
				{
					System.out.println("Invalid Postion");
					return;
					
				}
				if(pos ==1)
				{
					deleteFirst();
				}
				else if(pos == nodeCount)
				{
					deleteLast();
				}
				else
				{
					Node n = head;
					
					for(int i =1 ;i <pos-1;i++)
					{
						n = n.next;
					}
					Node free = n.next;
					n.next = free.next;
					free=null;
				}
			}
			
			public void Display()
			{
				System.out.println("Element in Link List are : ");
				
				Node n = head;
				
				while(n !=null)
				{
					System.out.printf("| "+ n.data + " |->");
					n = n.next;
				}
				System.out.println("NULL");
			}
			
			public int  count()
			{
				int Cnt =0;
				
				Node n = head;
				
				while(n != null)
				{
					Cnt++;
					n = n.next;
					
				}
				return Cnt;
				
			}
	
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SinglyLinklist obj = new SinglyLinklist();
		  


        obj.insertFirst(51);
        obj.insertFirst(21);
        obj.insertFirst(11);
        obj.Display();

        int nodeCount = obj.count();
        System.out.println("Number of nodes are : " + nodeCount);

        obj.InsertLast(101);
        obj.InsertLast(111);
        obj.InsertLast(121);
        obj.Display();

        nodeCount = obj.count();
        System.out.println("Number of nodes are : " + nodeCount);

        obj.InseartAtPos(105, 5);
        obj.Display();

        obj.deleteAtpos(5);
        obj.Display();

        nodeCount = obj.count();
        System.out.println("Number of nodes are : " + nodeCount);

        obj.deleteFirst();
        obj.Display();

        nodeCount = obj.count();
        System.out.println("Number of nodes are : " + nodeCount);

        obj.deleteLast();
        obj.Display();

        nodeCount = obj.count();
        System.out.println("Number of nodes are : " + nodeCount);
    }


	}
		

