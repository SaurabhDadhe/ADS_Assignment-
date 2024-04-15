//4. Check whether the Given Numberis a Palindrome or NOT. 


import java.util.Scanner;

class Palindrome
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		
		System.out.println("\n======================");
		int rev=0;
		int r=0,t=no;
		
		while(t!=0)
		{
			r=t%10;
			rev=rev*10+r;//124
			t=t/10;
		}
		if(no==rev)
				System.out.println("Palindrome");
		else
				System.out.println("Not Palindrome");
		System.out.println("\n======================");
	
	}
	
}