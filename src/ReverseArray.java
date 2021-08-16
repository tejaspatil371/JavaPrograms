import java.util.*;
public class ReverseArray {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Array Size");
		int n=sc.nextInt();
		System.out.println("Enter Array Element  ");
		int a[]=new int[n];
 		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
 		System.out.println("Array Element Is  ");
 		for(int i=0;i<n;i++)
 		{
 			System.out.println("  "+a[i]);
 			
 		}
 		System.out.println("Reverse Array Element Is  ");
 		for(int i=n-1;i>=0;i--)
 		{
 			System.out.println("  "+a[i]);
 			
 		}
	}

}
