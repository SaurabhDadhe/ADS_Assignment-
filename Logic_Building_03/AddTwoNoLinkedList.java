// 10.Add two numbers represented by linked list in java



import java.util.Scanner;
class AddTwoNoLinkedList
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
	
	int addition(Node r1,Node r2)
	{
		String s1="",s2="";
		Node p=r1,q=r2;
		
		while(p!=null)
		{
			s1=s1+p.data;
			p=p.next;
		}
		
		while(q!=null)
		{
			s2=s2+q.data;
			q=q.next;
		}
		
		
		int no1=Integer.parseInt(s1);
		int no2=Integer.parseInt(s2);
		System.out.println(no1+" "+no2);
		int no3=no1+no2;
		return no3;
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
		AddTwoNoLinkedList list=new AddTwoNoLinkedList();
		
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
			System.out.println("5. additon of two linked list no");
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
				       int sum=list.addition(r1,r2);
					   System.out.println(sum);
				        break;
				
			}
		}
	}
}