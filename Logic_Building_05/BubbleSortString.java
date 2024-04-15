
class BubbleSortString
{
	
	public static void sort(String[] arr) // 5,22,1,7,6,12
	{
		for(int i=0;i<arr.length-1;i++)
		{
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j].compareTo(arr[j+1]) >0)
					{
						String temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
		}
	}
	public static void display(String[] arr)
	{
		for(String i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    String[] arr={"aishwarya","abhishek","shrikant","vinit"};
		BubbleSortString.display(arr);
		BubbleSortString.sort(arr);
		BubbleSortString.display(arr);
	}
}