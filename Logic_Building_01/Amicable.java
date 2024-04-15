
// 8.  Write a Java Program to check whether the given numbers are Amicable Numbersor NOT.
// 280 , sare ke fatcors ki sum 220 cchiye
// 220 , sare ke fatcors ki sum 280 cchiye
import java.util.Scanner;

class Amicable
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int a=sc.nextInt(); // 421
		
		System.out.println("enter a no:");
		int b=sc.nextInt(); // 421
		
		System.out.println("\n======================");
		int t1=a,t2=b;
		int sum1=0,sum2=0;
		for(int i=1;i<t1;i++)
		{
			if(t1%i==0)
			{
				sum1=sum1+i;
			}
		}
		
		for(int i=1;i<t2;i++)
		{
			if(t2%i==0)
			{
				sum2=sum2+i;
			}
		}
		
		
		if(sum1==b && a==sum2)
				System.out.println("Amicable No.");
		else
				System.out.println("Not Amicable No." );
		System.out.println("\n======================");
	
	}
	
}//