// 5. Write a Java Program to check whether the Given Number is Prime Number or NOT. 



import java.util.Scanner;

class Prime
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		
		System.out.println("\n======================");
		int temp=0;
		
		for(int i=2;i<no;i++)
		{
			if(no%i==0)
			{
				temp++;
			}
			if(temp >0)
				break;
		}
		
		if(temp ==0)
				System.out.println("Prime No.");
		else
				System.out.println("Not Prime No.");
		System.out.println("\n======================");
	
	}
	
}