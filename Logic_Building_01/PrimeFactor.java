//3. Write a Java Program to print all the Prime Factorsof the Given Number. 

import java.util.Scanner;

class PrimeFactor
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int no=sc.nextInt(); // 4
	
		System.out.println("\n======================");
		for(int i=2;i<=no;i++)
		{
			 /*
			 while(no%i == 0) {
            System.out.print(i+" ");
            no = no/i;
			*/
         
		 
			
			if(no%i==0)
			{
				
				int temp=0;
				for(int j=2;j<i;j++)
				{
					if(i%j==0)
					{
						temp++;
					}
				}
				if(temp==0)
				{
					
					System.out.print(i+" ");
				}
			}
			
		}
	
	
		System.out.println("\n======================");
		System.out.println();
	}
	
	
}