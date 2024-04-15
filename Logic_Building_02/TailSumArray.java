// 8. Tail recursion to calculate sum of array elements.


import java.util.Scanner;
class TailSumArray
{
	
	static int sum=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no");
		int no=sc.nextInt();
		int[] arr=new int[no];
		
		while(no!=0)
		{
			arr[--no]=sc.nextInt();
		}
		
		System.out.println("=========");
		System.out.println(	print(arr,arr.length));
	
	}
	
	public static int print(int[] arr,int no)
	{
		if(no==0)
		return 0;
	    else
		{
			
			print(arr,no-1);  // 2 2 2 2
		sum=sum+arr[no-1] ;
		}
			// 2 2 2 2
			return sum;
		
	}
	
}