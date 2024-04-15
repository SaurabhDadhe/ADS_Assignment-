import java.util.Scanner;
class PrintNo
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		System.out.println("=========");
		print(no);
	
	}
	
	public static int print(int no)
	{
		if(no <=0)
		return 0;
	    else
		{
			
			 print(no-1);
			System.out.print(no+" ");
		return 0;
		}
	}
}