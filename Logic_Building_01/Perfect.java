// 7. Write a Java Program to check whether the given number is Perfect Numberor NOT. 

// 28 = sum of all divisor (1,2,4,7,14)


import java.util.Scanner;

class Perfect
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		
		System.out.println("\n======================");
		int t1=no;
		int sum=0;
		for(int i=1;i<no;i++)
		{
			if(t1%i==0)
			{
				sum=sum+i;
			}
		}
		
		if(no==sum)
				System.out.println("Perfect No.")
		else
				System.out.println("Not Perfect No.");
		System.out.println("\n======================");
	
	}
	
}