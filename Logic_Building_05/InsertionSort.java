
class InsertionSort
{
	
	public static void sort(int[] arr) // 22,1,7,6,12
	{
		for(int i=1;i<arr.length;i++)
		{
				int item=arr[i]; // 1
				int j=i-1; // 0
				
				while(j>=0 && arr[j] > item ) // 22 >1
				{
					arr[j+1]=arr[j]; // 22
					j=j-1; // -1
				}
				
				arr[j+1]=item; // -1+1 = 0
				
				
				
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
		InsertionSort.display(arr);
		InsertionSort.sort(arr);
		InsertionSort.display(arr);
	}
}