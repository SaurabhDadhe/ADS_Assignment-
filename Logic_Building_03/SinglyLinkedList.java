// 1.Implement singly linked list in java

import java.util.Scanner;

class SinglyLinkedList
{
	//public static Node root;
	
	static class Node
	{
		int data;
		Node next;
		
		public Node(int data)
		{
			this.data=data;
			next=null;
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
		System.out.println(" ====================");
	}	
	
	
	}
	
	
	
	
	//=================================================
	//=================================================
	
	
	
	
	Node reverse(Node root)
	{
	Node current=root,prev=null,link;
	 if(root==null)
	 {
		  System.out.println(" list is empty , cant reverse ");
		System.out.println(" ====================");
		return root;
	 }
	else
	{
		while(current!=null)// 6 7 8 9  // 7 8 9  // 8 9  //9
		{
			link=current.next; // 7 8 9   // 8 9   // 9               //null
			current.next=prev; // null     //null 6    //null 6 7          // null 6 7 8
			prev=current; // 6              // 7  //  8              // 9
			current=link; // 7 8 9       // 8 9  // 9                  // null
		
	}	
	}
	root=prev; // null 6 7 8 9
	return root;
	
	}
	
	
	
	
	
	
	//=================================================
	//=================================================
	
    Node searchAtMiddle(Node root)
	{
	 // 2 1 5 3 6 7 9
	Node p=root,q=root;
	int count=0;
	 if(root!=null)
	 {
		while(p!=null )
		{
			count++;
			p=p.next;
		}
		
		int index=(count+1)/2;
		int c=0;
		
		while(q!=null && c!=index-1)
		{
			c++;
			q=q.next;
		}
		
		return q;
		
		
	}
	else
	{
		System.out.println(" list is empty ");
		System.out.println(" ====================");
		return root;
	}
	
	
	}
	
	
	
			//=================================================
	//=================================================	


    Node searchAtNthPositionFromEnd(Node root,int index)// index=3
	{
	 // 2 1 5 3 6 7 
	Node p=root,q=root;
	int count=0,c=0;;
	 if(root!=null)
	 {
		 while(q!=null)
		 {
			 c++;
			 q=q.next;
		 }
		 int i=c-index;
		while(p.next!=null && count!=i)
		{
			count++;
			p=p.next;
		}
		
		return p;
		
	}
	else
	{
		System.out.println(" list is empty ");
		System.out.println(" ====================");
		return root;
	}
	
	
	}
	
			//=================================================
	//=================================================	


    Node searchAtNthPosition(Node root,int index)// index=3
	{
	 // 2 1 5 3 6 7 
	Node p=root;
	int count=0;
	 if(root!=null)
	 {
		while(p.next!=null && count!=index-1)
		{
			count++;
			p=p.next;
		}
		
		return p;
		
	}
	else
	{
		System.out.println(" list is empty ");
		System.out.println(" ====================");
		return root;
	}
	
	
	}


	//=================================================
	//=================================================
			
	
	Node deleteAtNthPosition(Node root,int index)// index=3
	{
	 // 2 1 5 3 6 7 
	Node p=root;
	int count=0;
	 if(root!=null)
	 {
		while(p.next!=null && count!=index-1)
		{
			count++;
			p=p.next;
		}
		
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
	int count=0;
	 if(root!=null)
	 {
		while(p.next!=null && count!=index-1)
		{
			count++;
			p=p.next;
		}
		n.next=p.next;
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
		while(p.next.next!=null)// 6 7 8 
		{
			p.next=null;
		}
		
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
		 System.out.println("jj");
		 //	 System.out.println("========");
		 root=n;
	 }
	else
	{
		// System.out.println("jjw");
		 //	 System.out.println("============");
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
		SinglyLinkedList s=new SinglyLinkedList();
		Node a=null;
		Node root=null;
	    int choice=1;
		while(choice!=0)
		{
			System.out.println("1. add at start");
			System.out.println("2. add at end");
			System.out.println("3. add at nth posiiton");
			
			
			System.out.println("4. delte at start");
			System.out.println("5. delete at end");
			System.out.println("6. delete at nth posiiton");
			
			System.out.println("7. search at index");
			System.out.println("71. search at index from end");
			System.out.println("8. search middle");
			System.out.println("9. reverse");
			System.out.println("10. display");
			
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
				       a=s.searchAtNthPosition(root,sc.nextInt());
					 System.out.println(a.data);
				        break;
						
						case 71:
				        System.out.println("enter a positin from end");
							System.out.println("-------------");
				       a=s.searchAtNthPositionFromEnd(root,sc.nextInt());
					 System.out.println(a.data);
				        break;
				
				case 8:
				      a=s.searchAtMiddle(root);
					  	System.out.println("-------------");
						System.out.println(a.data);
				        break;
				
				case 9:
				       root=s.reverse(root);
					   	System.out.println("-------------");
				        break;
				case 10:
				       s.display(root);
					   	System.out.println("-------------");
				       break;
				
			}
			
		}
		
		
         		
		
	}

}