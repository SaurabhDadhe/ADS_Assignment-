// 4. Decimal to binary number using recursion


import java.util.Scanner;
class DecimalToBinary
{
	 
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		
		System.out.println("=========");
		print(no);
	
	}
	
	public static float print(int no)
	{
		if(no==0)
			return 0;
		else
		{
			
		print(no/2);
		System.out.print(no%2+" ");
			return 1;
		}
		
	}
	
	
}