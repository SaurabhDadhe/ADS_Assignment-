// 9. Write a Java Program to check whether the given number is Ramanujan's Numberor NOT.

import java.util.Scanner;

class Ramanujan
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 421
		int temp=0;
		
		
			for(int i=0;i<no;i++)
			{
				int sum=0;
				for(int j=0;j<no;j++)
				{
					if(sum >no)
					{
						break;
					}
					else if(sum==no)
					{
						temp++;
						break;
					}
						sum= (int) Math.pow(i,3) + (int) Math.pow(j,3);
					
					
				}
					//System.out.println();
			}
			
		
		
		if(temp >0)
				System.out.println("Ramanujan's  No.");
		else
				System.out.println("Not Ramanujan's  No." );
		System.out.println("\n======================");
	
	}
	
}//

