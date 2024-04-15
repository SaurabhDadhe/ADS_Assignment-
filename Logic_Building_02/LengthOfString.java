
// 7. Program for length of a string using recursion

import java.util.Scanner;
class LengthOfString
{
	static int l=0;
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.next();
		
		System.out.println("=========");
		System.out.println(print(str));
	
	}
	
	public static int print(String str)
	{
		if(str.equals(""))
			return 0;
		else
		return	print(str.substring(1))+1 ;
		
	}
	
	
}