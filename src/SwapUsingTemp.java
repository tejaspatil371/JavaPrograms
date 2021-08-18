import java.util.*;
public class SwapUsingTemp {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two Integer to Swap   ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		System.out.println("Before Swapping Integer a = "+a+", b = "+b);
		temp=a;
		a=b;
		b=temp;
		System.out.println("After Swapping Integer a = "+a+", b = "+b);

	}

}
