
class MergeSort
{
	
	public static void sort(int[] arr,int l,int r) // 22,1,7,6,12
	{
		if(l<r)
		{
			int mid=l+(r-l)/2;
			sort(arr,l,mid);
			sort(arr,mid+1,r);
			merge(arr,l,mid,r);
		}
	}
	
	public static void merge(int[] arr,int l,int mid,int r)
	{
		int n1=mid-l+1;
		int n2=r-mid;
		
		int L[]=new int[n1];
		int R[]=new int[n2];
		
		
		for(int i=0;i<n1;i++)   
			L[i]=arr[l+i];
		
		for(int j=0;j<n2;j++)
			R[j]=arr[mid+1+j];
		
		
		int i=0,j=0;
		int k=l;
		
		while(i<n1 && j <n2)
		{
			if(L[i]<=R[j])
			{
				arr[k]=L[i];
				i++;
				k++;
			}
			else
			{
				arr[k]=R[j];
				j++;
				k++;
			}
		}
		
		while(i<n1)
		{
			arr[k]=L[i];
				i++;
				k++;
		}
		
		while(j<n2)
		{
			arr[k]=R[j];
				j++;
				k++;
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
		MergeSort.display(arr);
		MergeSort.sort(arr,0,arr.length-1);
		MergeSort.display(arr);
	}
}