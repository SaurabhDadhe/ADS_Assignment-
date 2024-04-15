
import java.util.Scanner;

class DoublyLinkedList
{
	//public static Node root;
	
	static class Node
	{
		int data;
		Node next;
		Node prev;
		
		public Node(int data)
		{
			this.data=data;
			next=prev=null;
		}
	}
	
		//=================================================
	//=================================================
	
	void display(Node root)
	{
		 	System.out.println("-------------");
		Node p=root;
	 if(root==null)
	 {
		System.out.println(" list is empty ");
		System.out.println(" ====================");
	 }
	else
	{
		while(p!=null)
		{
			System.out.print(p.data+" ");
			p=p.next;
		}
		System.out.println(" \n====================");
	}	
	
	
	}
	
	
	
	
	//=================================================
	//=================================================
	
	
	
	
	Node reverse(Node root)
	{
	Node current=root,p=null;
	
	while(current!=null) //  6 7 8   //  8 7 6
	{
		 p = current.prev;  
            current.prev = current.next;
            current.next = p;
            current = current.prev;
	}
	
	 if (p != null) {
            root= p.prev;
        }
	
	return root;
	
	}
	
	
	
	
	
	
	

//=================================================
	//=================================================
	
	
	

Node insertValueInSortedList(Node root,int data)
{
	Node n=new Node(data);
	Node p=root,r=p;
	Node q=null;
	
	
	while(r.next!=null)
	{
		r=r.next;
	}
	
	r.next=n;
	n.prev=r;
	
	
	while(p!=null)
	{
		q=p.next;
		
		while(q!=null)
		{
			if(p.data > q.data)
			{
				int t=p.data;
				p.data=q.data;
				q.data=t;
			}
			q=q.next;
		}
		p=p.next;
	}
	
	return root ;
}



//=================================================
	//=================================================
	
	
	

Node findLargestNode(Node root)
{
	 Node p=root,larg=new Node(0);
	 
	 if(root==null)
	 {
		 System.out.println("list is empty");
		  return null;
	 }
	else
	{
		while(p!=null)// 6 7 8 
		{
			if(larg.data < p.data)
			{
				larg.data=p.data;
			}
			p=p.next;
		}
		return larg;
	}	
}




//=================================================
	//=================================================
	
	
	

int findLengthOfList(Node root)
{
	Node p=root;
	int c=0;
	 if(root==null)
	 {
		  return 0;
	 }
	else
	{
		while(p!=null)// 6 7 8 
		{
			p=p.next;
			c++;
			
		}
		
	}	
	
	return c;
}

	//=================================================
	//=================================================
			
	
	Node deleteAtNthPosition(Node root,int index)// index=3
	{
	 // 2 1 5 3 6 7 
	Node p=root;
	int count=1;
	 if(root!=null)
	 {
		while(p.next!=null && count!=index-1)
		{
			count++;
			p=p.next;
		}
		
	
		p.next.next.prev=p;
		p.next=p.next.next;
		
		
		
	}
	else
	{
		System.out.println(" list is empty ");
		System.out.println(" ====================");
	}
	
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	Node addAtNthPosition(Node root,int data,int index)// index=3
	{
	Node n=new Node(data); // 2 1 5 3 6 7 
	Node p=root;
	int count=1;
	 if(root!=null)
	 {
		while(p.next!=null && count!=index-1)
		{
			count++;
			p=p.next;
		}
		
		
		n.next=p.next;
		p.next.prev=n;
		
		n.prev=p;
		p.next=n;
		
		
	}
	else
	{
		System.out.println(" list is empty ");
		System.out.println(" ====================");
	}
	
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	
	
	Node deleteAtEnd(Node root)
	{
	Node p=root;
	 if(root==null)
	 {
		  System.out.println(" list is empty , cant delete ");
		System.out.println(" ====================");
	 }
	else
	{
		while(p.next.next!=null)// 6 7 8 9
		{
			p=p.next;
			
		}
		p.next.prev=null;
		p.next=null;
		
	}	
	
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	Node addAtEnd(Node root,int data)
	{
	Node n=new Node(data);
	Node p=root;
	 if(root==null)
	 {
		 root=n;
	 }
	else
	{
		while(p.next!=null)
		{
			p=p.next;
		}
		
		p.next=n;
		n.prev=p;
	}	
	
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	
	
	Node deleteAtStart(Node root)
	{
	 if(root==null)
	 {
		 System.out.println(" list is empty , cant delete ");
		System.out.println(" ====================");
	 }
	else
	{
		root.next.prev=null;
		root=root.next;
	}	
	
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	
	
	Node addAtStart(Node root,int data)
	{
		// System.out.println("========");
		Node n=new Node(data);
	 if(root==null)
	 {
		 //System.out.println("jj");
		 //	 System.out.println("========");
		 root=n;
	 }
	else
	{
	   root.prev=n;
	   n.next=root;
	   root=n;
		
	}	
	// System.out.println("========");
	return root;
	}
	
	
		//=================================================
	//=================================================
	
	
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		DoublyLinkedList s=new DoublyLinkedList();
		Node a=null;
		Node root=null;
		Node sort=null;
	    int choice=1;
		while(choice!=0)
		{
			System.out.println("1. add at start");
			System.out.println("2. add at end");
			System.out.println("3. add at nth posiiton");
			
			
			System.out.println("4. delte at start");
			System.out.println("5. delete at end");
			System.out.println("6. delete at nth posiiton");
			
			System.out.println("7. find length of list");
			System.out.println("8. find largest node");
			System.out.println("9. insert value in sorted way , in sorted list");
			System.out.println("10. reverse");
			System.out.println("11. display");
			
			choice=sc.nextInt();
			System.out.println("-------------");
			switch(choice)
			{
				case 1:
				        System.out.println("enter a elemtn");
						int no=sc.nextInt();
						System.out.println("-------------");
				        root=s.addAtStart(root,no);
				        break;
				case 2:
				        System.out.println("enter a elemtn");
							System.out.println("-------------");
				       root= s.addAtEnd(root,sc.nextInt());
				        break;
				case 3:
				        System.out.println("enter a elemtn and postion");
							System.out.println("-------------");
				       root= s.addAtNthPosition(root,sc.nextInt(),sc.nextInt());
				        break;
				
				case 4:
				        root=s.deleteAtStart(root);
							System.out.println("-------------");
						// System.out.println(a);
				        break;
						
				case 5:
				         root=s.deleteAtEnd(root);
						 	System.out.println("-------------");
						 //System.out.println(a);
				        break;
			
				case 6:
				               System.out.println("enter a positin");
							   	System.out.println("-------------");
				        root=s.deleteAtNthPosition(root,sc.nextInt());
						// System.out.println(a);
				        break;
			
				
				case 7:
				        System.out.println("enter a positin");
							System.out.println("-------------");
				       int l=s.findLengthOfList(root);
					 System.out.println(l);
				        break;
						
				case 8:
				       
							System.out.println("-------------");
				       a=s.findLargestNode(root);
					 System.out.println(a.data);
				        break;
				
				case 9:
				System.out.println("enter a elemnt");
				    sort= s.insertValueInSortedList(root,sc.nextInt());
					  	System.out.println("-------------");
						s.display(sort);
				        break;
				
				case 10:
				       root=s.reverse(root);
					   	System.out.println("-------------");
				        break;
				case 11:
				       s.display(root);
					   	System.out.println("-------------");
				       break;
				
			}
			
		}
		
		
         		
		
	}

}