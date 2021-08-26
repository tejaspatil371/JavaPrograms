import java.util.Scanner;

public class SearchArrayElement {

	public static void main(String[] args) 
	{
		int flag=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size  ");
		int size=sc.nextInt();
		System.out.println("Enter Array Element  ");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			
			a[i]=sc.nextInt();
		}
		System.out.println("Array Element Are  ");
		for(int i=0;i<size;i++)
		{
			System.out.println("  "+a[i]);
		}
		
		System.out.println("Enter Array element to be Search");
		int search=sc.nextInt();
		for(int i=0;i<size;i++)
		{
			if(a[i]==search)
			{
				System.out.println("Element "+search+" Found at index "+i);
				flag=1;
				break;
			}
		}
		
		if(flag==0)
			{
				System.out.println("Element "+search+" Not Found");
			}
		}
		
}

