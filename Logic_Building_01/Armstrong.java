// 6. Write a Java Program to check whether the given number is Armstrong Numberor NOT. 


import java.util.Scanner;

class Armstrong
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 153
		
		System.out.println("\n======================");
		int temp=0,t1=no,t2=no;
		int l=0;
		
		while(t1!=0)
		{
			l++;
			t1=t1/10;
		}
		int sum=0;
		for(int i=0;i<l;i++)
		{
			int r=t2%10;
			int mul=1;
			for(int j=0;j<l;j++)
			{
				mul=mul*r;
			}
			sum=sum+mul;
			t2=t2/10;
		}
		
		
		if(sum==no)
				System.out.println("Armstrong No.");
		else
				System.out.println("Not Armstrong No.");
		System.out.println("\n======================");
	
	}
	
}