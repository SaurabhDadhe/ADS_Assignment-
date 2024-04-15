// 2. Sum of natural numbers using recursion



import java.util.Scanner;
class SumOfNaturalNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		System.out.println("=========");
		System.out.println(	print(no));
	
	}
	
	public static int print(int no)
	{
		if(no <=0)
		return 0;
	    else
		{
			
			return no+ print(no-1);
			
		}
	}
}