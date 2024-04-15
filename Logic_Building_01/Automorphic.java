// automorphic no

import java.util.Scanner;

class Automorphic
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		
		int n=(int)Math.pow(no,2);
		
		int r=0,sum=0,temp=0,c=1,a=0;
		while(n!=0)
		{
			
			r=n%10; // 625
			sum=sum+r*c;
			c=(int)Math.pow(10,++a);
			n=n/10;
		//	System.out.print(sum+" ");
			if(sum==no)
			{
				temp++;
				break;
			}
		}
		
		
		if(temp>0)
				System.out.println("\nAutomarphic  No.");
		else
				System.out.println("\nNot Automarphia No." );
		System.out.println("\n======================");
	
	}
	
}