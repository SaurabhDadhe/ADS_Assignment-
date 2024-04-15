
import java.util.Scanner;

class Lcm
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a no:");
		int a=sc.nextInt(); // 4
		System.out.println("enter a no:");
		int b=sc.nextInt(); // 6
		System.out.println("======================");
	    int l=gcd(a,b);
		int lcm=(a*b)/l;
		System.out.println(lcm);
	}
	
	static int gcd(int a,int b)
	{
		if(a>b)
		{
				if(a%b==0)
			return b;
				else 
			return gcd(a,a-b);
		}
		else{
				if(b%a==0)
			return a;
				else 
			return gcd(b-a,b);
		}
		
	
	}
}