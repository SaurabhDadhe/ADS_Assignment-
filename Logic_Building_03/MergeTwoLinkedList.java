// 4.How to merge two linked list in sorted order in java

import java.util.Scanner;
class MergeTwoLinkedList
{
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
		System.out.println("\n ====================");
	}	
	
	
	}
	
	
	//=================================================
	//=================================================
	
	
	Node merge(Node r1,Node r2)
	{
	Node p=r1,q=r2,sort=null;
	 if(r1==null && r2==null)
	 {
		 System.out.println(" list is empty ");
		System.out.println(" ====================");
	 }
	else
	{
		while(p.next!=null)
		{
			p=p.next;
		}
		p.next=q;
		//---------------
		//sort logic...
		
		
		sort=r1;
		Node a=r1;
		Node b=null;
		
		while(a!=null)
		{
			b=a.next;
			while(b!=null)
			{
				if(a.data > b.data)
				{
					int t=a.data;
					a.data=b.data;
				    b.data=t;
				}
				b=b.next;
			}
			a=a.next;
		}
		
	}	
	
	return sort;
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
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		MergeTwoLinkedList list=new MergeTwoLinkedList();
		
		Node r1=null;
		Node r2=null;
		Node s=null;
		
		 int choice=1;
		while(choice!=0)
		{
			
			System.out.println("1. add at end for list 1");
			System.out.println("2. display list 1");
			System.out.println("3. add at end for list 2");
			System.out.println("4. display list 2");
			System.out.println("5. merge in sorted order");
			System.out.println("5. display merged list");
			choice=sc.nextInt();
			System.out.println("-------------");
			switch(choice)
			{
				case 1:
				        System.out.println("enter a elemtn for list 1");
						int no=sc.nextInt();
						System.out.println("-------------");
				         r1= list.addAtEnd(r1,no);
				        break;
				case 2:
				        list.display(r1);
				        break;
						
				case 3:
				        System.out.println("enter a elemtn for list 2");
				
						System.out.println("-------------");
				         r2= list.addAtEnd(r2,sc.nextInt());
				        break;
				case 4:
				       list.display(r2);
				        break;
				case 5:
				       s=list.merge(r1,r2);
				        break;
				case 6:
				     list.display(s);
				        break;
			}
		}
	}
}