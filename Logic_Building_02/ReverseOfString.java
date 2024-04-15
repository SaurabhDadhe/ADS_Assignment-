// 6. Print reverse of a string using recursion


import java.util.Scanner;
class ReverseOfString
{
	 public static String s="";
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a String");
		String str=sc.next();
		
		System.out.println("=========a");
		System.out.println(print(str,str.length()));
	
	}
	
	public static String print(String str,int no)
	{
		if(no==0)
			return "";
		else
			return str.charAt(no-1)+print(str,no-1);
		
	}
	
	
}