import java.util.Scanner;
public class SelectionSort 
{	
	void sort(int arr[])
	{
		
		int n=arr.length;
		for(int i=0;i<n-1;i++)
		{
			int min=i;	
			for(int j=i+1;j<n;j++)
			{
				if(arr[j]<arr[min])
				{
					  min=j;
				}	  
			}
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
		}
	}
		
	void display(int arr[])
	{
		System.out.println("Sorted Array Element are  ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("  "+arr[i]);
		}
		 System.out.println();

	}

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter array size  ");
		int num=sc.nextInt();
		int arr[]=new int[num];
		System.out.println("Enter Array Element");
		for(int i=0;i<num;i++)
		{
			arr[i]=sc.nextInt();
		}		
		SelectionSort ss=new SelectionSort();
		ss.sort(arr);
		ss.display(arr);
	}
}
