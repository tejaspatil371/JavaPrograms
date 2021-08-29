import java.util.*;
public class MeanOfNumber {

	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Size of Elements   ");
		int size=sc.nextInt();
		System.out.println("Enter the Elements   ");
		int a[]=new int[size];
		for(int i=0;i<size;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("Elements are  ");
		for(int i=0;i<size;i++)
		{
			System.out.print("  "+a[i]);
		}	
		System.out.println();
		int sum=0;
		for(int i=0;i<size;i++)
		{
			 sum=sum+a[i];
		}
		System.out.println("Sum of Element is =  "+sum);
		int mean=sum/size;
		System.out.println("Mean is = "+mean);
	}

}
