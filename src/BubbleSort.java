import java.util.*;
public class BubbleSort {

	public static void main(String[] args) 
	{
		int temp;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Element Size");
		int n=sc.nextInt();
		System.out.println("Enter Elements  ");
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements Before Sorting  ");
		for(int i=0;i<n;i++)
		{
			System.out.print("  "+a[i]);
		}
		System.out.println();		
		for(int i=0;i<n-1;i++)
		{
			for(int j=0;j<((n-i)-1);j++)
			{
				if(a[j]>a[j+1])
				{
					temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;					
				}
			}			
		}
		System.out.println(" Element After Bubble Sort ");
		for(int i=0;i<n;i++)
		{
			System.out.print("  "+a[i]);
		}	
	}
}
