
// 3. Mean of Array using Recursion

import java.util.Scanner;
class MeanOfArray
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
	
	public static float print(int[] arr,int no)
	{
		if(no==1)
		return arr[no-1];
	    else
			return (float)(arr[no-1]+( print(arr,no-1)*(no-1)))/no;
			
			
		
	}
	
	
}