import java.util.*;
public class LargestFromThree {

	public static void main(String[] args) 
	{	
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Any Three Numbers  ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		System.out.println("a= "+a+" b= "+b+" c= "+c);
		if(a>b)
		{
			if(a>c)
			{
				System.out.println("A is Greater  "+a);
			}
		}
		if(b>a)
		{
			if(b>c)
			{
				System.out.println("B is Greater  "+b);
			}
		}
		if(c>a)
		{
			if(c>b)
			{
				System.out.println("C is Greater  "+c);
			}
		}	
	}
}
