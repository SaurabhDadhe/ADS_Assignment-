
class BubbleSort
{
	
	public static void sort(int[] arr) // 5,22,1,7,6,12
	{
		for(int i=0;i<arr.length-1;i++)
		{
				for(int j=0;j<arr.length-1-i;j++)
				{
					if(arr[j]>arr[j+1])
					{
						int temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
		}
	}
	public static void display(int[] arr)
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    int[] arr={5,22,1,7,6,12};
		BubbleSort.display(arr);
		BubbleSort.sort(arr);
		BubbleSort.display(arr);
	}
}