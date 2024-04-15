// 9.How to check if linked list is palindrome in java

import java.util.Scanner;
class ListPalindrome
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
	
	boolean chkPalindrome(Node root)
	{
		String s="";
		Node p=root;
		
		while(p!=null)
		{
			s=s+p.data;
			p=p.next;
		}
		
		int no=Integer.parseInt(s);
		//System.out.println(no+"------------dd");
		int t=no;
		int sum=0;
		while(t!=0)
		{
			int r=t%10;
			sum=sum*10+r;
			t=t/10;
		}
		//System.out.println(sum);
		if(sum==no)
			return true;
		else 
			return false;
		
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
		ListPalindrome list=new ListPalindrome();
		
		Node r1=null;
		
		 int choice=1;
		while(choice!=0)
		{
			
			System.out.println("1. add at end for list ");
			System.out.println("2. display list ");
			System.out.println("3. chk its palindrome or not");
			
			choice=sc.nextInt();
			System.out.println("-------------");
			switch(choice)
			{
				case 1:
				        System.out.println("enter a elemtn  ");
						int no=sc.nextInt();
						System.out.println("-------------");
				         r1= list.addAtEnd(r1,no);
				        break;
				case 2:
				        list.display(r1);
				        break;
						
				case 3:
				         Boolean b= list.chkPalindrome(r1);
						 if(b)
							System.out.println("yes palindorme"); 
						 else
							 	System.out.println("not palindorme"); 
				        break;
				
				       
			}
		}
	}
}
