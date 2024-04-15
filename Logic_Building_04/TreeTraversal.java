
import java.util.Scanner;

class TreeTraversal
{
  
	
	static class Node
	{
		int data;
		Node left,right;
		
		Node(int data)
		{
			this.data=data;
			left=right=null;
		}
	}
	
	
	
	//===========================================
	//=============================================
	
	boolean searchNode(Node root,int data)
	{
		if(root==null)
			return false;
		if(root.data==data)
			return true;
		
		boolean b1=	searchNode(root.left,data);
		if(b1)
			return true;
		//System.out.print("dd");
		 
		boolean b2=	searchNode(root.right,data);
			return b2;
		
			
	}
	
	
	//===========================================
	//=============================================
	
	
	Node trav(Node root,int data)
	{
		Node r=null;
		if(root==null)
			return null;
		
			
			
			while(root.data!=data)
			{
				if(root.data >data)
				{
					r=root;
					//System.out.print(r.data+"== ");
					root=root.left;
				}
				else if(root.data < data)
				{
						r=root;
					//System.out.print(r.data+" ==");
					root=root.right;
				}
				
			}
		
		return r;
	}
	
	
	//===========================================
	//=============================================
	
	
	
	
	//===========================================
	//=============================================
	
	int searchInOrderPredesessor(Node root,int data)
	{
		Node p=root,q=root,r=null;
		p=inOrderSuccessor(p,data);
		//System.out.print(p.data+" ");
			if(p.left!=null)
			{
				return max(p.left);
			}
			else
			{
				while(q.data!=data)
				{
					if(q.data<data)
					{
						r=q;
						q=q.right;
					}
					else
						q=q.left;
				}
				return r.data;
			}
	}
	
	
	int max(Node root)
	{
		int x=0;
		
		while(root!=null)
		{
			x=root.data;
			root=root.right;
		}
		return x;
	}
	
	
	
	
	
	
	
	
	Node inOrderSuccessor(Node root,int data)
	{
		if(root==null)
			return root;
		else if(root.data > data)
		{
			
			root=inOrderSuccessor(root.left,data);
		}
		else if(root.data < data)
		{
			root=inOrderSuccessor(root.right,data);
		}
		return root;
	}
	
	int searchInOrderSuccessor(Node root,int data)
	{
		Node p=root,q=root,r=null;
		p=inOrderSuccessor(p,data);
		//System.out.print(p.data+" ");
			if(p.right!=null)
			{
				return min(p.right);
			}
			else
			{
				while(q.data!=data)
				{
					// System.out.print(q.data+" ===========");
					if(q.data > data)
					{
			           r=q;
			          q=q.left;
					}
					else
						 q=q.right;
				}
				return r.data;
			}
			
		}
	
	
	
	//===========================================
	//=============================================
	
	
	
	
	void  postOrder (Node root)
	{
		if(root!=null)
		{
			postOrder(root.left);
			postOrder(root.right);
			System.out.print(root.data+" ");
		}
		
	}
	
	
	
	
	
	
	//===========================================
	//=============================================
	
	
	
	
	void  preOrder (Node root)
	{
		if(root!=null)
		{
			System.out.print(root.data+" ");
			preOrder(root.left);
			preOrder(root.right);
		}
	
	}
	
	
	
	
	//===========================================
	//=============================================
	


	
	 void  inOrder (Node root)
	{
		if(root!=null)
		{
			inOrder(root.left);
			System.out.print(root.data+" ");
			inOrder(root.right);
		}
		
	}
	
	
		//===========================================
	//=============================================
	
	
	
	Node deleteNode(Node root,int data)
	{
		if(root==null)
		{
			return root;
		}
		else if(data < root.data)
		{
			root.left=deleteNode(root.left,data);
		}
		else if(data > root.data)
		{
			root.right=deleteNode(root.right,data);
		}
		else
		{
			if(root.left==null)
			{
				return root.right;
			}
			if(root.right==null)
			{
				return root.left;
			}
			
			root.data=min(root.right);
			root.right=deleteNode(root.right,root.data); // min value wala niche ka place delete kr denge,kyu ki uska
                                                        //			hamne root main add kia hai
			
			
		}
		return root;
	}
	
	
	//===========================================
	//=============================================
	
	
	int heightOfTree(Node root)
	{
		if(root==null)
			return 0;
		else
		{
			int ld=heightOfTree(root.left);
			int rd=heightOfTree(root.right);
			
			if(ld >rd)
				return ld+1;
			else return rd+1;
		}
	}
	
	
	//===========================================
	//=============================================
	
	
	
	int min(Node root)
	{
		int x=0;
		
		while(root!=null)
		{
			x=root.data;
			root=root.left;
		}
		return x;
	}
	
	//===========================================
	//=============================================
	
	Node addNode(Node root,int data)
	{
		if(root==null)
		{
			root=new Node(data);
			return root;
		}
		else
		{
			if( data < root.data)
			{
				root.left=addNode(root.left,data);
			}
			if(data > root.data)
			{
				root.right=addNode(root.right,data);
			}
		}
		return root;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		TreeTraversal s=new TreeTraversal();
		
		Node root=null;
		Node a=null;
	    int choice=1;
		while(choice!=0)
		{
			System.out.println("\n-------------");
			System.out.println("1. insert a node in tree");
			System.out.println("2. delete a node in tree");
			
			
			System.out.println("3. search a node in tree");
			System.out.println("4. inorder successor");
			System.out.println("5. inorder predecessor");
			
			System.out.println("6. preorder traversal");
			System.out.println("7. inorder traversal");
			System.out.println("8. postorder traversal");
			System.out.println("9. head/parent node of every tree/sub tree");
			System.out.println("10. find height/depth of tree");
			
			choice=sc.nextInt();
			System.out.println("-------------");
			switch(choice)
			{
				case 1:
				        System.out.println("enter a elemtn");
						int no=sc.nextInt();
						System.out.println("-------------");
				        root=s.addNode(root,no);
				        break;
				case 2:
				        System.out.println("enter a elemtn");
						System.out.println("-------------");
				        root= s.deleteNode(root,sc.nextInt());
				        break;
				case 3:
				        System.out.println("enter a data to search");
						System.out.println("-------------");
				        boolean bol= s.searchNode(root,sc.nextInt());
						if(bol)
							System.out.println("YES node exist !!!");
						else
							System.out.println("NO node doesn't exist !!!");
				        break;
				
				case 4:
				        System.out.println("enter a data ");
						System.out.println("-------------");
						Node p=root;
						//s.searchInOrderSuccessor(p,sc.nextInt());
						System.out.println(s.searchInOrderSuccessor(p,sc.nextInt()));
				        break;
						
				case 5:
				        System.out.println("enter a data ");
				        //a=s.searchInOrderPredesessor(root,sc.nextInt());
						System.out.println(s.searchInOrderPredesessor(root,sc.nextInt()));
						//System.out.println(a.data);
				        break;
				case 6:
				        s.preOrder(root);
						break;
				case 7:
						s.inOrder(root);
						break;
				case 8:	
						s.postOrder(root);
						break;
				case 9:
				        System.out.println("enter a data ");
						a=s.trav(root,sc.nextInt());
						 System.out.println(a.data);
					
						break;
				case 10:
						int b=s.heightOfTree(root);
						System.out.println(b);
						break;
						
			}
			
		}
		
		
         		
		
	}
}