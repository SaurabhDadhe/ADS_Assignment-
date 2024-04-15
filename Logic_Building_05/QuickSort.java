
class QuickSort
{
	
	public static void sort(int[] arr,int l,int r) // 22,1,7,6,12
	{
		if(l<r)
		{
			int pi=partition(arr,l,r);
			sort(arr,l,pi-1);
			sort(arr,pi+1,r);
		}
	}
	
	static int partition(int[] arr,int low,int high)
	{
		int pi=arr[high];
		int i=low-1;
		
		for(int j=low;j<=high-1;j++)
		{
			if(arr[j] < pi)
			{
				i++;
				swap(arr,i,j);
			}
		}
		
		swap(arr,i+1,high);
		return(i+1);
	}
	
	static void swap(int[]arr,int l,int r)
	{
		int temp=arr[l];
		arr[l]=arr[r];
		arr[r]=temp;
	}
	
	
	public static void display(int[] arr)
	{
		for(int i:arr)
			System.out.print(i+" ");
		System.out.println();
	}
	
	public static void main(String[] args)
	{
	    int[] arr={5,22,1,7,6,12,8};
		QuickSort.display(arr);
		QuickSort.sort(arr,0,arr.length-1);
		QuickSort.display(arr);
	}
}