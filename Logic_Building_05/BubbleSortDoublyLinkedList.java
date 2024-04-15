
class BubbleSortDoublyLinkedList
{
	public static Node root;
	public static class Node
	{
	int data;
	Node next,prev;
	
	public Node(int d)
	{
	data=d;
	prev=next=null;
	}
	}
	
	public static void sort(Node root) // 5,22,1,7,6,12
	{
		Node p=root;
		Node q=null;
		
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
	}
	
	public static Node add(Node root,int data)
	{
	 Node p=root;
	 Node n=new Node(data);
	 if(p==null)
	 {
	 root=n;
	 return root;
	 }
	 else
	 {
		  while(p.next!=null)
	 p=p.next;
	 
	 p.next=n;
	 n.prev=p;
	 }
	 
	
	 
	 return root;
	}
	
	public static void display(Node root)
	{
		while(root!=null)
		{
		System.out.print(root.data+" ");
		root=root.next;
		}
		System.out.print("\n");
	}
	
	public static void main(String[] args)
	{
	    //String[] arr={"aishwarya","abhishek","shrikant","vinit"};
		//root=null;
		root=BubbleSortDoublyLinkedList.add(root,101);
		BubbleSortDoublyLinkedList.add(root,72);
		BubbleSortDoublyLinkedList.add(root,12);
		BubbleSortDoublyLinkedList.add(root,11);
		BubbleSortDoublyLinkedList.add(root,19);
		
		BubbleSortDoublyLinkedList.display(root);
		BubbleSortDoublyLinkedList.sort(root);
	    BubbleSortDoublyLinkedList.display(root);
	}
}